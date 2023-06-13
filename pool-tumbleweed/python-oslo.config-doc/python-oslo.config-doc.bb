SUMMARY = "Documentation for OpenStack common configuration library"
DESCRIPTION = "Documentation for the oslo-config library."
LICENSE = "Apache-2.0"

PV = "9.1.1"

RPM_NAME = "python-oslo.config-doc-9.1.1-1.1.noarch.rpm"
RPM_HASH = "2d25dd1af60cd3f5cf24ebe2b241a0245ed68fcd13ecc40127db6664ad134654ee0cfd83b43066f6199b805ced02728a0c8b9d0eaf3972ba4d065982f5689f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.config-doc"

RDEPENDS:${PN} += ""

inherit rpm
