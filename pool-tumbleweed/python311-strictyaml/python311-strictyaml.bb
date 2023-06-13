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

RPM_NAME = "python311-strictyaml-1.6.2-1.3.noarch.rpm"
RPM_HASH = "6071442a43e96b74d8edd559d746d240e6d60a96a24cc6b4acacd5b548cd06335ddfe42d8ec414205e9db7ce5848114c47f4f8ff7648f51ebf703a1cdf7e794a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(strictyaml) \
python311-strictyaml \
python3dist(strictyaml)"

RDEPENDS:${PN} += "python(abi) \
python311-python-dateutil"

inherit rpm
