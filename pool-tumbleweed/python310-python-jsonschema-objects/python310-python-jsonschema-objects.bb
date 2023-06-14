SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-python-jsonschema-objects-0.4.1-3.3.noarch.rpm"
RPM_HASH = "7a8527ede390873c35bd9740227df159b0c86dd12568334193dec67b9a2866d72b3ce2d1a56f3c6371adcdc524699513057d447a8b56e21fb17bbcfa577fefe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-jsonschema-objects \
python3.10dist-python-jsonschema-objects \
python310-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "python-abi \
python310-Markdown \
python310-inflection \
python310-jsonschema \
python310-six"

inherit rpm
