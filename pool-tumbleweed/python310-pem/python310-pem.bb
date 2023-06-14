SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python310-pem-21.2.0-1.4.noarch.rpm"
RPM_HASH = "2987e107c2764bc6fe9495ae4e7fe64642d1f05058b9995d5f4476c149a71cab79b4545e8206dae17d52710fa1fa8a9ffba809c355ef2ff2a2b546b82cc209a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pem \
python3.10dist-pem \
python310-pem \
python3dist-pem"

RDEPENDS:${PN} += "python-abi"

inherit rpm
