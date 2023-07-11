SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python311-pynxos-0.0.5-1.15.noarch.rpm"
RPM_HASH = "73fff6bbfd2f36e198aad78a74e9667c895da4e8c68571afa74ced7f06727b8c1f9f59cc8e5345378495e8aef42f9d9f2fde24602f45951c542917c5651668dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynxos \
python3.11dist-pynxos \
python311-pynxos \
python3dist-pynxos"

RDEPENDS:${PN} += "python-abi \
python311-future \
python311-requests \
python311-scp"

inherit rpm
