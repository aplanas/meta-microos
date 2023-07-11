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

RPM_NAME = "python39-strictyaml-1.6.2-2.2.noarch.rpm"
RPM_HASH = "97288b8dfc27d41df226306620ce67582d9495b5ae64af4b0530a684664efbaaf67277ca46204c640d74bdb3c292b15526673bde45e745f0a42e03d322184c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-strictyaml \
python39-strictyaml \
python3dist-strictyaml"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil"

inherit rpm
