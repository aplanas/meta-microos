SUMMARY = "Documentation for OpenStack messaging library"
DESCRIPTION = "The Oslo messaging API supports RPC and notifications over a number \
of different messaging transports. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "14.2.0"

RPM_NAME = "python3-oslo.messaging-doc-14.2.0-1.1.noarch.rpm"
RPM_HASH = "3700804815a8b740a1734cb9ed2b8a44dee95f49db2b0e4af75b62cec37fc6511afdce6039d3282f1ea429fb1793e70586bdd953699ef10dac8ae38c99b11207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.messaging-doc"
RDEPENDS:${PN} += ""

inherit rpm
