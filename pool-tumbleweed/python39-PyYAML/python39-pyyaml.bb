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

PV = "6.0"

RPM_NAME = "python39-PyYAML-6.0-5.3.aarch64.rpm"
RPM_HASH = "37f58013330c5abd24babfdc349355ad20e3c11a2524e57d5820a1a4e82faf2310c85e9414fb72464957c6382dd68ec623d18b6af992a2ff1c3d864da92065c1"

RPROVIDES:${PN} += "python3.9dist-pyyaml \
python39-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
