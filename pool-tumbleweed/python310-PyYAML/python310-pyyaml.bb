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

RPM_NAME = "python310-PyYAML-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "3cf86ce4aaaba9989880bc2cf5506e90e2f31f00010d682cac7097fd4a0dfd301346358f1c67747a3116f4f452542780a82d10134babc4fa9eaee9575b4f8c35"

RPROVIDES:${PN} += "python3.10dist-pyyaml \
python310-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
