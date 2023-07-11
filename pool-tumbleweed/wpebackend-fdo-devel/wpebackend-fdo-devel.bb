SUMMARY = "Development files for wpebackend-fdo"
DESCRIPTION = "The wpebackend-fdo-devel package contains libraries, build data, and \
header files for developing applications that use wpebackend-fdo."
LICENSE = "BSD-2-Clause"

PV = "1.14.0"

RPM_NAME = "wpebackend-fdo-devel-1.14.0-1.3.aarch64.rpm"
RPM_HASH = "1c088dd67a71a31d1dcc12b931c4c0a1017c53cabc9ef1fa6016696fbc1f73c3b15adeabbe719f3fb7ed0983c00283aa309e44fbb95f4413e9dbdf7fcf6b0eab"

RPROVIDES:${PN} += "pkgconfig-wpebackend-fdo-1.0 \
wpebackend-fdo-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libWPEBackend-fdo-1-0-1 \
pkgconfig-wpe-1.0"

inherit rpm
