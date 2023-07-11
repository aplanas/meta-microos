SUMMARY = "Tools to work with collections"
DESCRIPTION = "jaraco.collections Tools for working with collections. \
Models and classes to supplement the stdlib ‘collections’ module."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python311-jaraco.collections-4.1.0-1.3.noarch.rpm"
RPM_HASH = "a3ec07e71249a7b58ef7b50253387e0b3b1e581d8f600fa5404bff23129e22411fba70371d6014bcb8c5690cb514d9e725a0987ef38a15e365b5c1ad93e512b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.collections \
python3.11dist-jaraco.collections \
python311-jaraco.collections \
python3dist-jaraco.collections"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.classes \
python311-jaraco.text"

inherit rpm
