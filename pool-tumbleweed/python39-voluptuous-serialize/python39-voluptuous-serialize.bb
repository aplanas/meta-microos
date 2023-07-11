SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python39-voluptuous-serialize-2.5.0-1.5.noarch.rpm"
RPM_HASH = "062103acad4b2e0bcb7bafe3ee12d53f450bd844b64d41b9b5b2c7b7260a928623b4ef1a16d67bd43a2e6e7dabdaeba05fb35ee454b20be61f192ff09c5ddc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-voluptuous-serialize \
python39-voluptuous-serialize \
python3dist-voluptuous-serialize"

RDEPENDS:${PN} += "python-abi \
python39-voluptuous"

inherit rpm
