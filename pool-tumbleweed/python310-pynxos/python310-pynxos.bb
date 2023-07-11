SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python310-pynxos-0.0.5-1.15.noarch.rpm"
RPM_HASH = "331063eef1a02b74ab4c7cf1a7c54bf64968a8f6c96fadb3cfbc8ea9e247273bd3c9b12f96d4fbbe58554ae657f1b127f2ac68f2d8f549cbb00297c486f38f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynxos \
python310-pynxos \
python3dist-pynxos"

RDEPENDS:${PN} += "python-abi \
python310-future \
python310-requests \
python310-scp"

inherit rpm
