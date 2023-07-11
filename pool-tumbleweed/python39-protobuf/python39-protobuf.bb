SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.3"

RPM_NAME = "python39-protobuf-4.23.3-5.1.aarch64.rpm"
RPM_HASH = "445b663ea7b8be353616593b48d4567ea70ecc35f376cbd239194e49348caefe5d9d792b1c24ad2a9f1eb2ec142f5c3db15c1220afe327135794c55fd5970e05"

RPROVIDES:${PN} += "python3.9dist-protobuf \
python39-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
