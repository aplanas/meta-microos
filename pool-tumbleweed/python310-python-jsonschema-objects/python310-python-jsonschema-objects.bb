SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python310-python-jsonschema-objects-0.4.2-1.1.noarch.rpm"
RPM_HASH = "fe94417a80ae7401ee9a4f4f3db9177ccafad17d621c085ecfd6d26867971e0b5fb824fc1bd854f68a9723ca8ec419adc661328577880a20da315cb9ee710656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-jsonschema-objects \
python310-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "-python310-jsonschema >= 2.3 with python310-jsonschema < 4.18 \
python-abi \
python310-Markdown \
python310-inflection \
python310-six"

inherit rpm
