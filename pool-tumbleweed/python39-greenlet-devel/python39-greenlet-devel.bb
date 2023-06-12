SUMMARY = "C development headers for python-greenlet"
DESCRIPTION = "This package contains header files required for C modules development."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-greenlet-devel-2.0.2-1.1.noarch.rpm"
RPM_HASH = "c13289909f33691934d903abea9ce7c3ff8eecd2ee74fe9f23227bf559bc56910ec1dd9a01c96d125c81f584e75297f854e2f24ef21a1ca4a4f1c5afd6b794fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-greenlet-devel"
RDEPENDS:${PN} += "python39-greenlet"

inherit rpm
