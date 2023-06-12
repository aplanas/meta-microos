SUMMARY = "A caching library for Python"
DESCRIPTION = "Cachy provides a caching library."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-cachy-0.3.0-5.1.noarch.rpm"
RPM_HASH = "70df82528d16b2efb2e75b00d2a7d30858ef6b692f84d0f7b22b323dec784c22a47880e3c79317699f93144f643125965887c694c1aa91d01812d72d5821aa56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cachy) \
python39-cachy \
python3dist(cachy)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
