SUMMARY = "Filesystem Path Utilities"
DESCRIPTION = "Utility functions to manipulate filesystem pathnames"
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "libpath_utils1-0.2.1-27.18.aarch64.rpm"
RPM_HASH = "e1a1f3c4d56a0a70b8ee98f7929c3751af91f896263785b0ea513a26c1a841a1dc321d55fbc305ecb33aa0a1c1b1dfad52f44ec20170f386bdf694ecfbc4b48e"

RPROVIDES:${PN} += "libpath_utils.so.1()(64bit) \
libpath_utils.so.1(PATH_UTILS_0.2.1)(64bit) \
libpath_utils1 \
libpath_utils1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
