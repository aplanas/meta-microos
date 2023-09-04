SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.6"

RPM_NAME = "python310-jsonschema-4.18.6-1.1.noarch.rpm"
RPM_HASH = "bc6ee952c86c404a1ba7fd4269f52cda0d552f9fc657e234dbac706bdcf40357cc607f87d2bf6414687718dff16ea370e2ffd2b0edf14430e6b1a0a73d191144"
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
