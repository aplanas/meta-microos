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

RPM_NAME = "python310-PyYAML-6.0-5.1.aarch64.rpm"
RPM_HASH = "f0af59d08443fdeecc03aa7fc650b82f1e0b0b6d8305cbbde080a7c1f5e76d5b2cee56dcbc8170cab9f3e086ae9df1d166d13ba3f955ab181f0aa76242df1b49"

RPROVIDES:${PN} += "python3-PyYAML \
python3.10dist(pyyaml) \
python310-PyYAML \
python310-PyYAML(aarch-64) \
python3dist(pyyaml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libyaml-0.so.2()(64bit) \
python(abi)"

inherit rpm
