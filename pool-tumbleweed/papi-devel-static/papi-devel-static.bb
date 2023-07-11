SUMMARY = "Static PAPI libraries"
DESCRIPTION = "This package includes the static PAPI libraries."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi-devel-static-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "591ee2692bcbdfa6c80c17c605011d454b12ae90a0ee1de4d6f9aae6bab236c8f3e79bf9fd1a99a5a8b81f463a335ec06ee7579c14b9cc4e0539ea1998d0c7a3"

RPROVIDES:${PN} += "papi-devel-static"

RDEPENDS:${PN} += "linux-kernel-headers \
papi-devel"

inherit rpm
