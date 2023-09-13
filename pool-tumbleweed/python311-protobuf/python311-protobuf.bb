SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.4"

RPM_NAME = "python311-protobuf-4.23.4-6.2.aarch64.rpm"
RPM_HASH = "0fc47a86c0a544e40023101df3e09ff18789d60ffc067698fc8ddca894268ba1508103f2f8d68424030854dae853701d6ac26aeaad4ad5058052d582977e7e4f"

RPROVIDES:${PN} += "python3-protobuf \
python3.11dist-protobuf \
python311-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
