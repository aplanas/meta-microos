SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "python310-protobuf-21.12-3.2.aarch64.rpm"
RPM_HASH = "9fe104212cca8ee956f0ad299e425b7d0248a3f0b3cb97dc7b4b21cfd27bf97757ac854611e2520016b82d7371e32f43248e7c55ca6caaeaa46c02a92da37831"

RPROVIDES:${PN} += "python3-protobuf \
python3.10dist-protobuf \
python310-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
