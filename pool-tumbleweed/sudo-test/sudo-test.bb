SUMMARY = "Tests for the package"
DESCRIPTION = "Tests for fate#313276"
LICENSE = "ISC"

PV = "1.9.14p1"

RPM_NAME = "sudo-test-1.9.14p1-1.1.aarch64.rpm"
RPM_HASH = "e85a2f02a62baf7d8ced926a56424e6df40ac07a8d6d3dea2686d0acfbd21283fedee7ed1ac1df46eb08a11148ad779f000cca749602a55eb5862daa3e48d401"

RPROVIDES:${PN} += "sudo-test"

RDEPENDS:${PN} += "/usr/bin/sh \
sudo"

inherit rpm
