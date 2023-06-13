SUMMARY = "HTTP/2 framing layer for Python"
DESCRIPTION = "This library contains the HTTP/2 framing code used in the hyper project. \
It provides a pure-Python codebase that is capable of decoding a binary \
stream into HTTP/2 frames."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python310-hyperframe-6.0.1-2.1.noarch.rpm"
RPM_HASH = "1c7c9d15a55e3f79168f4b4bdfd3eb4082c7a031e4cde8d0078fbc004dd9eafbb267d2f445e285189941202db73d417a85822b8543946002433fbbde5eb6c864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hyperframe \
python3.10dist(hyperframe) \
python310-hyperframe \
python3dist(hyperframe)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
