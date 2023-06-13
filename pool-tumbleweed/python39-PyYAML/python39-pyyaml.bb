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

RPM_NAME = "python39-PyYAML-6.0-5.1.aarch64.rpm"
RPM_HASH = "2d61fd1cd82f1041963e9511e549907ca91907e5607cbb91609fe297790ddc0e936bc16c7b969320957e973d7b71088014a54e932fc1ed12ed1380e6f6894799"

RPROVIDES:${PN} += "python3.9dist(pyyaml) \
python39-PyYAML \
python39-PyYAML(aarch-64) \
python3dist(pyyaml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libyaml-0.so.2()(64bit) \
python(abi)"

inherit rpm
