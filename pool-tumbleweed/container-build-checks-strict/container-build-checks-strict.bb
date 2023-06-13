SUMMARY = "Strict configuration for container-build-checks"
DESCRIPTION = "Strict configuration for container-build-checks"
LICENSE = "GPL-2.0-or-later"

PV = "1682595397.5ce6d2f"

RPM_NAME = "container-build-checks-strict-1682595397.5ce6d2f-1.1.noarch.rpm"
RPM_HASH = "b85c664516434f63f29ca36454b074c28d3f531b05486d106059e1188a0d3c32a125e13854ade4169101c1c02ac675c16757491e81ab1cc4fbd9120edb92ca0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "container-build-checks-strict"

RDEPENDS:${PN} += ""

inherit rpm
