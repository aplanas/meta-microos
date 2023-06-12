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

RPM_NAME = "python310-imagecodecs-2023.3.16-1.2.aarch64.rpm"
RPM_HASH = "0c82e81842f0cb565c450fc92e6fe0095754819236b799b018151cabbc9121900a63c2edbca8c1a385ff82535bd77212955a0bb3e6198f3b2ad8088a444f6a0c"

RPROVIDES:${PN} += "python3-imagecodecs \
python3.10dist(imagecodecs) \
python310-imagecodecs \
python310-imagecodecs(aarch-64) \
python3dist(imagecodecs)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaec.so.0()(64bit) \
libavif.so.15()(64bit) \
libblosc.so.1()(64bit) \
libblosc2.so.2()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
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
liblzma.so.5(XZ_5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenjp2.so.7()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsnappy.so.1()(64bit) \
libsz.so.2()(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libtiff.so.6(LIBTIFF_4.5)(64bit) \
libwebp.so.7()(64bit) \
libz-ng.so.2()(64bit) \
libz-ng.so.2(ZLIB_NG_2.0.0)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit) \
libz.so.1(ZLIB_1.2.9)(64bit) \
libzfp.so.1()(64bit) \
libzopfli.so.1()(64bit) \
libzstd.so.1()(64bit) \
python(abi) \
python310-numpy \
update-alternatives"

inherit rpm