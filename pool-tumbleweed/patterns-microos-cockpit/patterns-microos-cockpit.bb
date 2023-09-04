SUMMARY = "Web based remote system managemet"
DESCRIPTION = "Packages required to run the Cockpit system management service. \
For the web service the cockpit-ws container is required."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-cockpit-5.0-73.1.aarch64.rpm"
RPM_HASH = "b882802daef035207fe7eb43130a56ff15da5bf73be42f7fc0b9ec0481ab05a2ac7adf56a74507b2ec35e646b6a225ed3758eeb8485c4140a38b5793e69f630e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-cockpit"

RDEPENDS:${PN} += "cockpit-podman \
cockpit-system"

inherit rpm
