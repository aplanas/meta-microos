SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python310-pem-21.2.0-2.1.noarch.rpm"
RPM_HASH = "915e71d23f064fcc9d6f85773c2adeeca6730406c30b8021d3f60b54bdd984cca226625cfe1df37f910391328ce35b2c809059a3638c406bd2e1e29624ef2568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pem \
python310-pem \
python3dist-pem"

RDEPENDS:${PN} += "python-abi"

inherit rpm
