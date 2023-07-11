SUMMARY = "Development files for fmt, a formatting library"
DESCRIPTION = "Development files for fmt, a formatting library for C++."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "fmt-devel-9.1.0-2.4.aarch64.rpm"
RPM_HASH = "5f786dde90ef5e9db91e69cce65476754825f9f25f6bd5c29f84a751ba287805cc0684bdb67b540dcfb4bc07ebebfbcffcd8d7bd3470e0ad120c7f903819caf7"

RPROVIDES:${PN} += "cmake-fmt \
fmt-devel \
pkgconfig-fmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfmt9"

inherit rpm
