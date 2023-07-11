SUMMARY = "Development files for libhtp"
DESCRIPTION = "The libhtp-devel package contains libraries and header files for \
developing applications that use libhtp."
LICENSE = "BSD-3-Clause"

PV = "0.5.44"

RPM_NAME = "libhtp-devel-0.5.44-1.1.aarch64.rpm"
RPM_HASH = "0082d5bc48061ca6a4bf9d910831a5e842112ff50fbda7e4666c79dd05ae2edb3e71c71ab7fc6c50ffcdd8e9517263af2d46716be1597141e87eee17262fc5da"

RPROVIDES:${PN} += "libhtp-devel \
pkgconfig-htp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhtp2"

inherit rpm
