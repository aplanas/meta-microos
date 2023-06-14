SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "python310-parse-1.19.0-1.10.noarch.rpm"
RPM_HASH = "ae58fcc12fbef29fad4c8117d0aba2e924e62c0543bc2623caeaa6abf311ea94b66b27592df2838e920a9867ef960142fe46cbb81708f92a52757026f70d9f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parse \
python3.10dist-parse \
python310-parse \
python3dist-parse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
