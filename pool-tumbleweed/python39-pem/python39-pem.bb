SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python39-pem-21.2.0-2.1.noarch.rpm"
RPM_HASH = "7c4058b47568d6fb7982f7c5b3b1e16ea8edd48c0661b07af3007e896355b3f4fe84109321256a2f5c6e679611e4fb2595a5bed5cdcbf183f30174f41de50068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pem \
python39-pem \
python3dist-pem"

RDEPENDS:${PN} += "python-abi"

inherit rpm
