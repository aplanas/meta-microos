SUMMARY = "A library for managing Cisco NX-OS devices through NX-API"
DESCRIPTION = "A library for managing Cisco NX-OS devices through NX-API"
LICENSE = "Apache-2.0"

PV = "0.0.5"

RPM_NAME = "python39-pynxos-0.0.5-1.15.noarch.rpm"
RPM_HASH = "27741e3f976ed71180f8d83d874c66fef0bbea4b4208aabd1eacf861abb228cf07a735645373a0dff15a07a5b4da63c5549320522d83581a52f4163ae97e9cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynxos \
python39-pynxos \
python3dist-pynxos"

RDEPENDS:${PN} += "python-abi \
python39-future \
python39-requests \
python39-scp"

inherit rpm
