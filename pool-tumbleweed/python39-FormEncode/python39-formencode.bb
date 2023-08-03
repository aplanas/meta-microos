SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.0.1"

RPM_NAME = "python39-FormEncode-2.0.1-3.1.noarch.rpm"
RPM_HASH = "22cb5055b821f130784f8876bdb8c01447695b03386d7977d2fa5c65f0edf3c5dd3acd889db694b8c8df8f7d31eb70b09b39779b2fd9714db9825b8f00033830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-formencode \
python39-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
