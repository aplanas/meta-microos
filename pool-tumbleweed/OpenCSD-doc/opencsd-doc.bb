SUMMARY = "Documentation for the OpenCSD API"
DESCRIPTION = "OpenCSD is an Arm CoreSight Trace Decode library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "OpenCSD-doc-1.4.0-1.2.noarch.rpm"
RPM_HASH = "a62f58ccc2218d21c95f9d0c027106b7c5c7c0a967bbac9f30a8c0b7cd12465bbfe57b318acb29b4a417d95f0b183d2a9e263f19da5c49dd021fb6f4b7064e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenCSD-doc"

RDEPENDS:${PN} += ""

inherit rpm
