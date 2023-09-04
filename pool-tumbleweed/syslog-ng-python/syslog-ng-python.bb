SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-python-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "9d5034f1168e04e78a30fce7bf1392893c60e1639305a048f437ce7b1d1bb30323333b8ca672f6708d7ceb9c01817d60edf7af1ebae946f4455b1fba02316435"

RPROVIDES:${PN} += "syslog-ng-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
