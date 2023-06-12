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

RPM_NAME = "python311-PyYAML-6.0-5.1.aarch64.rpm"
RPM_HASH = "1951ff057cc4dced5da6003517047b4e306473b8370360ffc6981e9d842a7f00dd3066f1aea3f9104cc8273f76977dd952be16c7cb10af864646786b13394180"

RPROVIDES:${PN} += "python3.11dist(pyyaml) \
python311-PyYAML \
python311-PyYAML(aarch-64) \
python3dist(pyyaml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libyaml-0.so.2()(64bit) \
python(abi)"

inherit rpm
