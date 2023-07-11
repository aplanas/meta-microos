SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.22.2"

RPM_NAME = "python311-proto-plus-1.22.2-1.4.noarch.rpm"
RPM_HASH = "f1d2a8ab5aa3b833c840995dd7ccd1c0e221a0bd7435e1dac35496cdd1a2f1d0432520610158eece8009b414fe0f0a001311c5ed398d64639f84d9c4f9696f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proto-plus \
python3.11dist-proto-plus \
python311-proto-plus \
python3dist-proto-plus"

RDEPENDS:${PN} += "python-abi \
python311-protobuf"

inherit rpm
