SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI. \
 \
This varaint of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "7da33f01061d281a087c43c56bf3b6cb3ec712275a980a9f4fde0444e73246d01f41cabc1fdf997b8f508ef167a0a4e765e26c0da31658a603bec3da7f6f2fb8"

RPROVIDES:${PN} += "libwx-baseu-suse-nostl.so.3.0.5 \
libwx-baseu-suse-nostl3-0-5 \
wxWidgets"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
