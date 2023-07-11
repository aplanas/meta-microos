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

RPM_NAME = "python310-PyYAML-6.0-5.3.aarch64.rpm"
RPM_HASH = "a799491cc5d2b21c0b473a819b20aa155cc9c8f43cf769755f2a1c019bd3301728833a19cb7d5548330ec5e2013865f4cce0b221879ab13c572f5779c8a33d10"

RPROVIDES:${PN} += "python3.10dist-pyyaml \
python310-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
