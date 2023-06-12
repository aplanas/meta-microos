SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-varint-1.0.2-1.12.noarch.rpm"
RPM_HASH = "45fdca547900654902e89a0d5bf57367f27d0d6b93b0e735d19b5efde155b6c8868ffb6e88508796774fcfd9c98a0849345c8e2b557d742756d376dc0c154a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-varint \
python3.10dist(varint) \
python310-varint \
python3dist(varint)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
