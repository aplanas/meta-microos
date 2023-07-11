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

RPM_NAME = "python310-strictyaml-1.6.2-2.2.noarch.rpm"
RPM_HASH = "60c5f991c6ba92b4cbf4d2187b0d34bdbf9eddbf5e90e4f9a9a7f53fbed37abb40028cbb1ab1b7094d1158ec5649f2644cc6d7505e15f9f128346f6720490188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-strictyaml \
python310-strictyaml \
python3dist-strictyaml"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil"

inherit rpm
