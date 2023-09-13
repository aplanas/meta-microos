SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.4"

RPM_NAME = "python310-protobuf-4.23.4-6.2.aarch64.rpm"
RPM_HASH = "9733df0bcc469fc4d5d9c72c1cb836692a1b10d9d10f30b58ce6f56a581374923b3369867a923b22ae2f397bf5044c176b34179360d9e1ee0cacebd5fa52438a"

RPROVIDES:${PN} += "python3.10dist-protobuf \
python310-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
