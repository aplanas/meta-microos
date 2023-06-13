SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "python39-protobuf-21.12-3.2.aarch64.rpm"
RPM_HASH = "54130921c972513f738f9b61d5b50e3eadc7a6389a0ad538bdd1ab7b3f8922837115416bdc89afea5fcc3ae396bff7c7abe2a88109b12c0f5e56da00b02e79f3"

RPROVIDES:${PN} += "python3.9dist(protobuf) \
python39-protobuf \
python39-protobuf(aarch-64) \
python3dist(protobuf)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
