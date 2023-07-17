SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.4"

RPM_NAME = "python311-protobuf-4.23.4-6.1.aarch64.rpm"
RPM_HASH = "c6d5bdb119e77769fef7334b927dd983bd0460bdb02ab6132e697fc0849115f86153d36ae6e840a18e78405244794b5d2e9c9e04a5a391a54297439fa167752a"

RPROVIDES:${PN} += "python3-protobuf \
python3.11dist-protobuf \
python311-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
