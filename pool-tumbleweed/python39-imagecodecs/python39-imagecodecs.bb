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

RPM_NAME = "python39-imagecodecs-2023.3.16-1.4.aarch64.rpm"
RPM_HASH = "92a4cf6b04997076f6af369918c13fd466014d906cab2488b74a2c163a07d6159a965eb2da7b092a9d679f9f4963260f6bfd0faa631284ab0a11d00302025467"

RPROVIDES:${PN} += "python3.9dist-imagecodecs \
python39-imagecodecs \
python3dist-imagecodecs"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
python39-numpy \
update-alternatives"

inherit rpm
