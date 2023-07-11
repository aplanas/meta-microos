SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.18.0"

RPM_NAME = "python310-jsonschema-4.18.0-1.1.noarch.rpm"
RPM_HASH = "d90f4309c8c262413ec519a19892cdeee33598ca21f6de8bff723324bfdf1c55402ae54dd7c8c5496a2c27f120d08a1a3ed0f6eff0e345c5e76a5ad51e2964ef"
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
