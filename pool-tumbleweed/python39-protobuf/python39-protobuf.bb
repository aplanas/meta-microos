SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.4"

RPM_NAME = "python39-protobuf-4.23.4-6.1.aarch64.rpm"
RPM_HASH = "2d2b0d1ed49b7d0096c86055b41c2382b15919382ae1505459cc4f3ada76a5b60564eaa4ebf342e7c6c40cb8d695b845ca88bb9bc6dee926c420ea855b0fc7bc"

RPROVIDES:${PN} += "python3.9dist-protobuf \
python39-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
