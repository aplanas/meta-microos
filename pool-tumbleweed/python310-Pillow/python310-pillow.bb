SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python310-Pillow-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "0633eba003d3cbf983a7a18d19b79e2c7a83322a03390cef58b90020da9d9ef40324451597862aceb01d545fcd80acabb1218b907e48cce52f3c4a865f2834d6"

RPROVIDES:${PN} += "python3-Pillow \
python3-imaging \
python3.10dist(pillow) \
python310-Pillow \
python310-Pillow(aarch-64) \
python310-imaging \
python3dist(pillow)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreetype.so.6()(64bit) \
libimagequant.so.0()(64bit) \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libopenjp2.so.7()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit) \
libxcb.so.1()(64bit) \
libz.so.1()(64bit) \
python(abi) \
python310-olefile"

inherit rpm
