SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.22.2"

RPM_NAME = "python39-proto-plus-1.22.2-1.4.noarch.rpm"
RPM_HASH = "e387750c1331bdc600a7caa2a4334837baafade8afad622a5a95b6359d37ff770f0e01e99c886e8223c5b07ce760860a6fcf8e7d30dcc6f211fb533545b64694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proto-plus \
python39-proto-plus \
python3dist-proto-plus"

RDEPENDS:${PN} += "python-abi \
python39-protobuf"

inherit rpm
