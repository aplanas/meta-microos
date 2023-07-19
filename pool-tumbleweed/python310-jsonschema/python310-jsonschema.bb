SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.3"

RPM_NAME = "python310-jsonschema-4.18.3-1.1.noarch.rpm"
RPM_HASH = "5860080c9f97cbff7eaf4873d567e71ed0f0bf5b6824c0ac6cd2e1c875f9702e51b64fa19a04add2a9bfedcc6c4ed0fa5e116826b21fcd1348b3ddae951b1e73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonschema \
python310-jsonschema \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-attrs \
python310-jsonschema-specifications \
python310-pyrsistent \
python310-referencing \
python310-rpds-py"

inherit rpm
