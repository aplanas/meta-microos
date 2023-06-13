SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI. \
 \
This varaint of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "df5b2182959bfeb80ffb2a320f702db093f88d0917ac2c1992e9a9a4613be0479f77e2b1b26f0c07f136f26fee5894029f6a73791c5cdfdb9d807bfcf7b725e6"

RPROVIDES:${PN} += "libwx_baseu-suse-nostl.so.3.0.5()(64bit) \
libwx_baseu-suse-nostl3_0_5 \
libwx_baseu-suse-nostl3_0_5(aarch-64) \
wxWidgets"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
