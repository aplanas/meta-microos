SUMMARY = "Include Files and Libraries for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using functions provided by the TidyLib library."
LICENSE = "W3C"

PV = "1.04"

RPM_NAME = "libtidyp-devel-1.04-16.28.aarch64.rpm"
RPM_HASH = "718ed916576c482e6cd0a3d0d69b0b05eb32960c8696207176331457815fcae0f1274fde1efbfed442487a75d3deeb9265d8e36d323ccd8a46251ba9865f3d3d"

RPROVIDES:${PN} += "libtidyp-devel"

RDEPENDS:${PN} += "glibc-devel \
libtidyp-1-04-0"

inherit rpm
