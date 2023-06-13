SUMMARY = "Caja overlay icons"
DESCRIPTION = "This package provides overlay icons to visualize the synchronization state \
in the Caja file manager."
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "owncloud-client-caja-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "97a6147d3cd61af068f60baee5f93b097f490791c9c95951b85b16f4a7e2e78bf4663fe068b6c90b506871e89106a087c69b9f7eb307c816dc4b22e304e57e30"

RPROVIDES:${PN} += "owncloud-client-caja \
owncloud-client-caja(aarch-64)"

RDEPENDS:${PN} += "nemo \
owncloud-client(aarch-64) \
python-caja"

inherit rpm
