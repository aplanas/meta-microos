SUMMARY = "Image transformation, compression, and decompression codecs"
DESCRIPTION = "Imagecodecs is a Python library that provides block-oriented, in-memory buffer \
transformation, compression, and decompression functions for use in the \
tifffile, czifile, and other scientific imaging modules. \
 \
Decode and/or encode functions are implemented for Zlib (DEFLATE), GZIP, \
ZStandard (ZSTD), Blosc, Brotli, Snappy, LZMA, BZ2, LZ4, LZ4F, LZ4HC, LZW, LZF, \
ZFP, AEC, LERC, NPY, PNG, GIF, TIFF, WebP, JPEG 8-bit, JPEG 12-bit, Lossless \
JPEG (LJPEG, SOF3), JPEG 2000, JPEG LS, JPEG XR, JPEG XL, AVIF, PackBits, Packed \
Integers, Delta, XOR Delta, Floating Point Predictor, Bitorder reversal, \
Bitshuffle, and Float24 (24-bit floating point)."
LICENSE = "BSD-3-Clause"

PV = "2023.3.16"

RPM_NAME = "python311-imagecodecs-2023.3.16-1.2.aarch64.rpm"
RPM_HASH = "b86097a76628a3afb352fa9536554397151d4b8e3fa2b12e1d90a18688b14b391af6e2f90bfe609f5d8d4d76e190e2dba6f00b558392a6c0166f4cded6ccc595"

RPROVIDES:${PN} += "python3.11dist(imagecodecs) \
python311-imagecodecs \
python311-imagecodecs(aarch-64) \
python3dist(imagecodecs)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
libaec.so.0()(64bit) \
libavif.so.15()(64bit) \
libblosc.so.1()(64bit) \
libblosc2.so.2()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcfitsio.so.10()(64bit) \
libcharls.so.2()(64bit) \
libdeflate.so.0()(64bit) \
libgif.so.7()(64bit) \
libheif.so.1()(64bit) \
libjpegxr.so.0()(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libjxl_threads.so.0.8()(64bit) \
libjxl_threads.so.0.8(JXL_0)(64bit) \
libjxrglue.so.0()(64bit) \
liblcms2.so.2()(64bit) \
liblz4.so.1()(64bit) \
liblzfse.so()(64bit) \
liblzhamdll.so()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsnappy.so.1()(64bit) \
libsz.so.2()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libz-ng.so.2()(64bit) \
libz.so.1()(64bit) \
libzfp.so.1()(64bit) \
libzopfli.so.1()(64bit) \
libzstd.so.1()(64bit) \
python(abi) \
python311-numpy \
update-alternatives"

inherit rpm
