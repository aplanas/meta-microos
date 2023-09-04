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

RPM_NAME = "python39-PyYAML-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "6459486fa372220f571310c85ca4e089f189b0e91bcac76cfe4e208a4f942832aa5848ed2c80ca0f55980b47da8a7a7b6793624ba7c90917b9f562b30de7382f"

RPROVIDES:${PN} += "python3.9dist-pyyaml \
python39-PyYAML \
python3dist-pyyaml"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyaml-0.so.2 \
python-abi"

inherit rpm
