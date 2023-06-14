SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python39-immutables-0.19-2.1.aarch64.rpm"
RPM_HASH = "b091954fc25d9d7d3d7cb4f78ba30de944c2cc62e4b7a7314f5974f2c06d481073d5267eb8896d1c69981824c11b1271d8b41d61296309d46e284ccb11fd005b"

RPROVIDES:${PN} += "python3.9dist-immutables \
python39-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
