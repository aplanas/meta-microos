SUMMARY = "Test suite for libfabric API"
DESCRIPTION = "Fabtests provides a set of examples that uses libfabric, a fabric software library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "fabtests-1.18.0-2.1.aarch64.rpm"
RPM_HASH = "6d9e7cff32493b52dfb3e1d2687cf6eb7fe83aa4db072f107007eb41c33192b92e248a4aca6cf75f49c392dade85747d49f522474c6663d10ad540eca44b4cc4"

RPROVIDES:${PN} += "fabtests \
fabtests(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfabric.so.1()(64bit)"

inherit rpm
