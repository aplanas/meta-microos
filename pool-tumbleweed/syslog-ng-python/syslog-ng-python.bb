SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-python-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "e65e50c2a959efb98954adf6d57b167a46b703b09e7f5df26456abe0883bb722f8d07aaac18e1bf97d8c957c5d294addaff011fafbebe553b649c350c4420bb2"

RPROVIDES:${PN} += "syslog-ng-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
