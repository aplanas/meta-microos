SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python311-Pillow-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "ba99d3146e7b0626df20da5b356964501ab3cfabb3a4efa1b2d9404cbebf68b95f1a8d8200a0c758f537a3b1d915c83864b27cf6286b7750c4c3c8dd7ac0dbfb"

RPROVIDES:${PN} += "python3.11dist(pillow) \
python311-Pillow \
python311-Pillow(aarch-64) \
python311-imaging \
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
python311-olefile"

inherit rpm
