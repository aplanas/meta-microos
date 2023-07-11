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

RPM_NAME = "python311-strictyaml-1.6.2-2.2.noarch.rpm"
RPM_HASH = "181941de62341ae55bec8335626ed1a580f1229d4124fddc388498e1f3ef16918f3d65c2f8faafdc4aadff509b79f99d66363ec00f95f970d8adb35f9262f60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-strictyaml \
python3.11dist-strictyaml \
python311-strictyaml \
python3dist-strictyaml"

RDEPENDS:${PN} += "python-abi \
python311-python-dateutil"

inherit rpm
