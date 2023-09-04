SUMMARY = "Development files for wpebackend-fdo"
DESCRIPTION = "The wpebackend-fdo-devel package contains libraries, build data, and \
header files for developing applications that use wpebackend-fdo."
LICENSE = "BSD-2-Clause"

PV = "1.14.2"

RPM_NAME = "wpebackend-fdo-devel-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "7f360689678b3dd6db13ac4a7280a83230f2be621550028f567ab75d172bc9adbcb508f6bff795cc665ae8f533e60e5731ceb90597c38ef1a754a2054303511c"

RPROVIDES:${PN} += "pkgconfig-wpebackend-fdo-1.0 \
wpebackend-fdo-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWPEBackend-fdo-1-0-1 \
pkgconfig-wpe-1.0"

inherit rpm
