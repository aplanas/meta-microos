SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.30"

RPM_NAME = "python311-pip-api-0.0.30-3.3.noarch.rpm"
RPM_HASH = "42d7b8a725247c1c61996d73284dbca946e56faf199d3d5cb1b409a4cf452616af002403ce731eec9b72a4bf34f0013ca6db305ebe45de7eb86b5fd67397e976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-api \
python3.11dist-pip-api \
python311-pip-api \
python3dist-pip-api"

RDEPENDS:${PN} += "python-abi \
python311-pip"

inherit rpm
