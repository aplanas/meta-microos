SUMMARY = "Email bounce detectors"
DESCRIPTION = "Email bounce detectors."
LICENSE = "Apache-2.0"

PV = "4.0"

RPM_NAME = "python310-flufl.bounce-4.0-4.3.noarch.rpm"
RPM_HASH = "2a83b18cd2eb76c9669ded14cc202a23cef64995779f3c8198684694120e48b8f4ea9d1a577f2c8bc456faaed785df00be1cce5e5b11c84636286c41dbde1ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flufl.bounce \
python310-flufl.bounce \
python3dist-flufl.bounce"

RDEPENDS:${PN} += "python-abi \
python310-atpublic \
python310-zope.interface"

inherit rpm
