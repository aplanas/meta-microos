SUMMARY = "Development package for Yate"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use Yate."
LICENSE = "GPL-2.0-only"

PV = "6.4.0"

RPM_NAME = "yate-devel-6.4.0-4.9.aarch64.rpm"
RPM_HASH = "d58dc286a442007108e11d18f173e146339b846297bc1cfdea1e13d88bf14a93795a823a13752bd6afa40c1047caa260c4561f8304b59c82df9abe4ae6d179ec"

RPROVIDES:${PN} += "pkgconfig-yate \
yate-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libyate6-4-0"

inherit rpm
