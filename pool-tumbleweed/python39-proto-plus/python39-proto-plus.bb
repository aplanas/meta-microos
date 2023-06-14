SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.22.2"

RPM_NAME = "python39-proto-plus-1.22.2-1.2.noarch.rpm"
RPM_HASH = "fd438821b991804801265ce27d3b2130a72e0fe433d7b210d064a21476944f9e8bc90b8d6032daea70d2411f69a2b793946b803217e2e3b7fd2a160d0dd36699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proto-plus \
python39-proto-plus \
python3dist-proto-plus"

RDEPENDS:${PN} += "python-abi \
python39-protobuf"

inherit rpm
