SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.2.3"

RPM_NAME = "python310-requests-gssapi-1.2.3-1.8.noarch.rpm"
RPM_HASH = "8947b15ca861183e00994bf33643c76523a987c2ab3c3f0b6066a51c5cbbf1df89cc28ffbf6c3d1b3983d49bf804068065b22e5fbb0b88d3386068a4393d1d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-gssapi \
python310-requests-gssapi \
python3dist-requests-gssapi"

RDEPENDS:${PN} += "python-abi \
python310-gssapi \
python310-requests"

inherit rpm
