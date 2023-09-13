SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-python-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "561e3d362f31e03029cec87e2da42ca42849ead77fcd5a9a4b193d01fd662cbf098de3630b59d2d5c330265432ab9161f01a304b02ef00f1d1159acd7a89456a"

RPROVIDES:${PN} += "syslog-ng-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
