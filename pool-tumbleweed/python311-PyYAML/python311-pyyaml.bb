SUMMARY = "YAML parser and emitter for Python"
DESCRIPTION = "YAML is a data serialization format designed for human readability \
and interaction with scripting languages. PyYAML is a YAML parser \
and emitter for Python. \
 \
PyYAML features a complete YAML 1.1 parser, Unicode support, pickle \
support, capable extension API, and sensible error messages. PyYAML \
supports standard YAML tags and provides Python-specific tags that \
allow to represent an arbitrary Python object. \
 \
PyYAML is applicable for a broad range of tasks from complex \
configuration files to object serialization and persistance."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-PyYAML-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "5ae58b9a7385bbea878f72e809bf9ac536010a6b328017cb4674917bed32b7ca19532929a8f47483ad3183efc6690e561e87d1dcc6df523b6939fec2caab8a67"

RPROVIDES:${PN} += "python3-PyYAML \
python3.11dist-pyyaml \
python311-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
