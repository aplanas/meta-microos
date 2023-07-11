SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "python310-parse-1.19.0-1.11.noarch.rpm"
RPM_HASH = "bd70d48af9b58306683ddd94e71df2415b620141d38d94091d133739226c58b33c6d564f621ebbdbcf25093a5a6efa7c159b25b7e3e21a6338fea2a2b2ce18d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parse \
python310-parse \
python3dist-parse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
