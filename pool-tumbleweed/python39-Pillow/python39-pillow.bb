SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python39-Pillow-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "e3511fc0bf5d54db44ffae1e786d973b04ea65dc99412efd30405be5bb624e6429bc239a3a2cc34b1239ce5d030a09282618f7def0f183ffc9fb8d6c2203edb8"

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
