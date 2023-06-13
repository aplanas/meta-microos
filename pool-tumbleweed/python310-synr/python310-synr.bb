SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python310-synr-0.6.0-1.6.noarch.rpm"
RPM_HASH = "2bf5c263e626aee289218d4cd5ecbdcfbc42741e8ae400f2d4022d2a4c9cf640892166832b10454b1573c50d7ce2f2f64d3ae04adcab20daadb938905feac568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-synr \
python3.10dist(synr) \
python310-synr \
python3dist(synr)"

RDEPENDS:${PN} += "python(abi) \
python310-attrs"

inherit rpm
