SUMMARY = "Library for solving linear systems over integers for 4ti2"
DESCRIPTION = "This package contains the 4ti2 library for solving systems linear systems over \
integers (\\mathbb{Z})."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.10"

RPM_NAME = "libzsolve0-1.6.10-1.1.aarch64.rpm"
RPM_HASH = "e4b03c4501df2a555e2efe5d288ca62e39e981617725698fe543ff433e20ad2ae98aca15ddcebf88776c6bfbeb8d5fd0b965663aeef7b62ec9e6e3e62de39514"

RPROVIDES:${PN} += "libzsolve.so.0()(64bit) \
libzsolve0 \
libzsolve0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
