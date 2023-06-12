SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python311-pem-21.2.0-1.4.noarch.rpm"
RPM_HASH = "f4acd8ef2fcac37466d1e0e8c4070a040bdbee920b00ae5510611ca5d7d250f9a88d96d770cccca4b9431d1b1131fa408810aeaaabb0cc2bd51ae5d711be1893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pem) \
python311-pem \
python3dist(pem)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
