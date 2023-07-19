SUMMARY = "Operator for the data fetching service"
DESCRIPTION = "Operator for the data fetching service for VM container images"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-operator-1.56.0-2.1.aarch64.rpm"
RPM_HASH = "699905baa3dbc29afbc37f43c410eac9e54b94f071fb77f0d55cab26d6cdda28df21bc7cb485041dc25ca363c58b94b0309c05b71931f97974ea3197362f950e"

RPROVIDES:${PN} += "containerized-data-importer-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
