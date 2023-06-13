SUMMARY = "Strict, typed YAML parser"
DESCRIPTION = "StrictYAML is a type-safe YAML parser that parses and validates a \
restricted subset of the YAML specification. \
 \
Priorities: \
 \
 * No parsing of hard to read and insecure features of YAML like the \
   Norway problem. \
 * Strict validation of markup and straightforward type casting. \
 * Acting as a near-drop in replacement for pyyaml, ruamel.yaml or poyo. \
 * Comment preservation across a read-write cycle \
 * Speed is not a key concern"
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python310-strictyaml-1.6.2-1.3.noarch.rpm"
RPM_HASH = "cf63677ea85d733de4714afa1572d91c632fc7f8a1aa4fb28b4fd2b6ada9c1d22e3153524dc539c8da534ac2752113f14d7867af3d204a227d136fbb8a41f6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-strictyaml \
python3.10dist(strictyaml) \
python310-strictyaml \
python3dist(strictyaml)"

RDEPENDS:${PN} += "python(abi) \
python310-python-dateutil"

inherit rpm
