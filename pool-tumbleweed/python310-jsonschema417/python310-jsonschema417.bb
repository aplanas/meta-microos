SUMMARY = "An implementation of JSON-Schema validation for Python"
DESCRIPTION = "jsonschema is an implementation of the JSON Schema specification for Python \
The validator can be used as python module and from console: \
 \
    $ jsonschema --instance sample.json sample.schema"
LICENSE = "MIT"

PV = "4.17.3"

RPM_NAME = "python310-jsonschema417-4.17.3-1.1.noarch.rpm"
RPM_HASH = "1008467de2fa3da572911cdfb387bfedf3ba344f3b3bae80224a61216b723b49905023ac47f345560d465802a4d19e54d5f90520ee0fbd59acb2bdf494956cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonschema \
python310-jsonschema \
python310-jsonschema417 \
python3dist-jsonschema"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-attrs \
python310-pyrsistent"

inherit rpm
