SUMMARY = "Documentation for OpenStack common configuration library"
DESCRIPTION = "Documentation for the oslo-config library."
LICENSE = "Apache-2.0"

PV = "9.1.1"

RPM_NAME = "python-oslo.config-doc-9.1.1-2.1.noarch.rpm"
RPM_HASH = "c765ff8eefac2bcffe9afaca35feb50817e86b880cd9e3b865efecfd6085b1600691ae670bb73b9827b5ae96453403a0a884962c39e22d85f094a34a17f21e05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.config-doc"

RDEPENDS:${PN} += ""

inherit rpm
