SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "python39-parse-1.19.0-1.11.noarch.rpm"
RPM_HASH = "25526b1b49e4cfc06f007b417f6880bd87303a6afd08e84103ad9f544dd9131339d725e89c39d0cdd198857c002042b1e7aa0d8f88a01eaba6f9d90e06c9bfc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parse \
python39-parse \
python3dist-parse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
