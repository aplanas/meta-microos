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

RPROVIDES:${PN} += "python3.11dist-imagecodecs \
python311-imagecodecs \
python3dist-imagecodecs"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libaec.so.0 \
libavif.so.15 \
libblosc.so.1 \
libblosc2.so.2 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libbz2.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libcharls.so.2 \
libdeflate.so.0 \
libgif.so.7 \
libheif.so.1 \
libjpegxr.so.0 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
libjxrglue.so.0 \
liblcms2.so.2 \
liblz4.so.1 \
liblzfse.so \
liblzhamdll.so \
liblzma.so.5 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libsnappy.so.1 \
libsz.so.2 \
libtiff.so.6 \
libwebp.so.7 \
libz-ng.so.2 \
libz.so.1 \
libzfp.so.1 \
libzopfli.so.1 \
libzstd.so.1 \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
