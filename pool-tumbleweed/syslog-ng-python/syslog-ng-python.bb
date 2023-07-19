SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-python-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "477e9af0769240ff38a855d2c1aa4b0b57ef46d47f06eae30d91ba8bb53e1804179ea13f5daf3b1d0d17bb12a4a44df9d335a5bef22587f5a546a65219431bfe"

RPROVIDES:${PN} += "syslog-ng-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
