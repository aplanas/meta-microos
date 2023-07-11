SUMMARY = "Python object model built on top of JSON schema"
DESCRIPTION = "Build self-validating python objects using JSON schemas."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python310-warlock-2.0.1-1.5.noarch.rpm"
RPM_HASH = "9ceaa651b2680ff4d3dd8c19103050267cc4c0a4d77b5356e14adfab42c457d1cfabca51a9f85a8b2046652df9246cbd3a452bdf3e0554460950884b412645a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-warlock \
python310-warlock \
python3dist-warlock"

RDEPENDS:${PN} += "python-abi \
python310-jsonpatch \
python310-jsonschema"

inherit rpm
