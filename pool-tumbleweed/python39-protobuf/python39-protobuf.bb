SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.4"

RPM_NAME = "python39-protobuf-4.23.4-6.2.aarch64.rpm"
RPM_HASH = "9c010555f749dc692fc54bc0af2a4893d4926edeb698ceefa335cfd21be085ad9d9f4d3b200fb2a3b0b7ec15457ccc3864a5011917c518b27068a7359045153f"

RPROVIDES:${PN} += "python3.9dist-protobuf \
python39-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
