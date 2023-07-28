SUMMARY = "Configuration files for persistent reservation helper"
DESCRIPTION = "The pr-helper-conf package provides configuration files for persistent \
reservation helper"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-pr-helper-conf-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "19e2d385533b9bee17504711bbad843e480df292db5f3aaa4130ab6bb1c1b0b646de7af605cfa9aa1b0abf26d6c0c84551461bce6aa797d13fc9c1bfa439a80d"

RPROVIDES:${PN} += "kubevirt-pr-helper-conf"

RDEPENDS:${PN} += ""

inherit rpm
