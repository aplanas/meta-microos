SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python310-Pillow-9.5.0-3.1.aarch64.rpm"
RPM_HASH = "5bd97d1ba6d85dc457164791fabbb3a161c279b183e3a61277800f62e852e7e7bc66fb8a63a10f898a3694caf4e27484e36586febad41328a7fb6b5ee75f12e1"

RPROVIDES:${PN} += "python3.10dist-pillow \
python310-PIL \
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
