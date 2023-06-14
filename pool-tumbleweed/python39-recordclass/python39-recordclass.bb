SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.18.0.1"

RPM_NAME = "python39-recordclass-0.18.0.1-1.5.aarch64.rpm"
RPM_HASH = "817927e67f164c84218d250623d0ab53e603b98e5042b3cc84dbaca2686e6efa6d9b62f92a659197d0a708c30e885c7e5249fa37ffd92699c3df8ab65ce6c42e"

RPROVIDES:${PN} += "python3.9dist-recordclass \
python39-recordclass \
python3dist-recordclass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
