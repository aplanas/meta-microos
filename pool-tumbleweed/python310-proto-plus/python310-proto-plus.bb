SUMMARY = "Pythonic Protocol Buffers"
DESCRIPTION = "This is a wrapper around protocol buffers. Protocol buffers is \
a specification format for APIs, such as those inside Google. \
This library provides protocol buffer message classes and objects \
that largely behave like native Python types."
LICENSE = "Apache-2.0"

PV = "1.22.2"

RPM_NAME = "python310-proto-plus-1.22.2-1.4.noarch.rpm"
RPM_HASH = "c9498d60a42b3b556a2585f667d92db0fe78748ffc323adf1ace19095bec9ca9db00aa6eb861f40c56e2c4225b214570dcd442e5800047e47c84dc4fa88b88e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-proto-plus \
python310-proto-plus \
python3dist-proto-plus"

RDEPENDS:${PN} += "python-abi \
python310-protobuf"

inherit rpm
