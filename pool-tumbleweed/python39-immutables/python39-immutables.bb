SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python39-immutables-0.19-4.1.aarch64.rpm"
RPM_HASH = "781afeaa241232b158328d3aca06229f294ce94f72e9b7aca8ff12dcbb027f2c15b00c4b9d50653a4516049525ac602be80d0e3a5a74582de0ec60f24dbe148e"

RPROVIDES:${PN} += "python3.9dist-immutables \
python39-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
