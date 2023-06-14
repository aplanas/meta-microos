SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python310-Pillow-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "0633eba003d3cbf983a7a18d19b79e2c7a83322a03390cef58b90020da9d9ef40324451597862aceb01d545fcd80acabb1218b907e48cce52f3c4a865f2834d6"

RPROVIDES:${PN} += "python3-Pillow \
python3-imaging \
python3.10dist-pillow \
python310-Pillow \
python310-imaging \
python3dist-pillow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libimagequant.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libopenjp2.so.7 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxcb.so.1 \
libz.so.1 \
python-abi \
python310-olefile"

inherit rpm
