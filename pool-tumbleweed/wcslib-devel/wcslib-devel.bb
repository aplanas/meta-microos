SUMMARY = "Development files for wcslib"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use wcslib."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "wcslib-devel-7.12-1.6.aarch64.rpm"
RPM_HASH = "2e5931264e5ae43f3255abcc10a9304296f7ea98d70241efba07b04db1385aed11d78f48bcc169c284037f6fab0902dba90293ce72faf982c76255559ba670a7"

RPROVIDES:${PN} += "libwcs-devel \
pkgconfig-wcslib \
wcslib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cfitsio-devel \
libwcs7"

inherit rpm
