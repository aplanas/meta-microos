SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "python311-parse-1.19.0-1.11.noarch.rpm"
RPM_HASH = "c1fbfd2375378a73cf8abb2ebe956ad6e07dfa5b1b6efb99bbc82594e8103e174cf9765be6733b309ab633aa32f5ddae6cc9fe3bd60d6734c138fe7d978e3dba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parse \
python3.11dist-parse \
python311-parse \
python3dist-parse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
