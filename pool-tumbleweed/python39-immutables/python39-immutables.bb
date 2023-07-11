SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python39-immutables-0.19-3.1.aarch64.rpm"
RPM_HASH = "983082b798a05159e54f95008974c8c905f8ec659a59f96a384f7fb027a9175bb6edb8d290a2193caa8c04b931a711a679e2a00a761fb884e90a73cb48ee1a61"

RPROVIDES:${PN} += "python3.9dist-immutables \
python39-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
