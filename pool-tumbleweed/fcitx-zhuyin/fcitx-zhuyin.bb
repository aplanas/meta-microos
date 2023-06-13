SUMMARY = "Libzhuyin Wrapper for Fcitx"
DESCRIPTION = "The libzhuyin project aims to provide the algorithms core \
for intelligent sentence-based Chinese zhuyin input methods. \
 \
This is a libzhuyin wrapper for fcitx."
LICENSE = "GPL-2.0-only"

PV = "0.1.0+git20150626.36064e1"

RPM_NAME = "fcitx-zhuyin-0.1.0+git20150626.36064e1-3.13.aarch64.rpm"
RPM_HASH = "b0cb7d0546005d8aad0d654120ad79211db6a7e625173bbc88943caa7a26db3fd14baabc4fbbc5c7727aa3adb53b176f227fe8615849c2ff763400a0e9f2211a"

RPROVIDES:${PN} += "fcitx-zhuyin \
fcitx-zhuyin(aarch-64) \
locale(fcitx:zh_TW;zh_HK)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libzhuyin.so.15()(64bit) \
libzhuyin.so.15(LIBZHUYIN)(64bit)"

inherit rpm
