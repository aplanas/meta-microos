SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python39-Pillow-9.5.0-2.3.aarch64.rpm"
RPM_HASH = "a3e751b370c518b77afc08aadbf1d24f168022684d2f60855b549ed90287c1096206b1e9dde97203bbed880da0ae94d46febb7729a0d193e72978d5a224ee66d"

RPROVIDES:${PN} += "python3.9dist-pillow \
python39-Pillow \
python39-imaging \
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
python39-olefile"

inherit rpm
