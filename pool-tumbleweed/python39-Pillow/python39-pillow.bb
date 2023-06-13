SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python39-Pillow-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "e3511fc0bf5d54db44ffae1e786d973b04ea65dc99412efd30405be5bb624e6429bc239a3a2cc34b1239ce5d030a09282618f7def0f183ffc9fb8d6c2203edb8"

RPROVIDES:${PN} += "python3.9dist(pillow) \
python39-Pillow \
python39-Pillow(aarch-64) \
python39-imaging \
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
python39-olefile"

inherit rpm
