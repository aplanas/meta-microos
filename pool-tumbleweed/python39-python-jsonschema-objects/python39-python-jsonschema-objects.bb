SUMMARY = "An object wrapper for JSON Schema definitions"
DESCRIPTION = "An object wrapper for JSON Schema definitions"
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "python39-python-jsonschema-objects-0.4.2-1.1.noarch.rpm"
RPM_HASH = "b184ed943f318ff71ba1970a7a64fac3bc5622c8a71c48ee981d0e5106fd8afc3f7974d0095aa280e8faea4085346bce736c067cf8b22b501c4cb63a76c15a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-jsonschema-objects \
python39-python-jsonschema-objects \
python3dist-python-jsonschema-objects"

RDEPENDS:${PN} += "-python39-jsonschema >= 2.3 with python39-jsonschema < 4.18 \
python-abi \
python39-Markdown \
python39-inflection \
python39-six"

inherit rpm
