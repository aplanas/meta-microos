SUMMARY = "Documentation for the OpenCSD API"
DESCRIPTION = "OpenCSD is an Arm CoreSight Trace Decode library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "OpenCSD-doc-1.4.0-1.3.noarch.rpm"
RPM_HASH = "31d24eabb559c0e28d935480953df60810e88e4050797286b3a37250e627b6f040c0b5a1e08da2eb6f4d8879f9aa5d63123de1fbdf7572b85ddc3c974008f8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenCSD-doc"

RDEPENDS:${PN} += ""

inherit rpm
