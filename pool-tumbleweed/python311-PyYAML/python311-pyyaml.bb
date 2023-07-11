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

RPM_NAME = "python311-PyYAML-6.0-5.3.aarch64.rpm"
RPM_HASH = "904f697ce57dd1ce6dc13232409f85cf6233ca0d73e8910d921b1a5882d707b770fd4c8460d14e02adf092245b7efd6059eedebde37fa569682c247765b0a46b"

RPROVIDES:${PN} += "python3-PyYAML \
python3.11dist-pyyaml \
python311-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
