SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python39-unittest-mixins-1.6-2.9.noarch.rpm"
RPM_HASH = "3884644e04e8202c46b5e0db5c176b06224a31c53cee2cb8a2de613c3eda3eab5681b6c4dbc16e5a093d0809b3a2218135f55d81b0f940a829510c9095e9c984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unittest-mixins \
python39-unittest-mixins \
python3dist-unittest-mixins"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
