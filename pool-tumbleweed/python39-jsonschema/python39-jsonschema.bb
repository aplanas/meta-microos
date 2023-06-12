SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python39-jsonschema-4.17.3-3.1.noarch.rpm"
RPM_HASH = "32b2bd80d3638f9b2e8311536c8c1b5a906836f43a409d04c85d9e2768de6a94fc65732e1a6f0e1775622c9264ba8e6e832931bf2c8355d82b63b8585b108455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonschema) \
python39-jsonschema \
python3dist(jsonschema)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-attrs \
python39-pyrsistent"

inherit rpm
