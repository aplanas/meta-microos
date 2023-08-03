SUMMARY = "Python destination support for syslog-ng"
DESCRIPTION = "This package provides Python destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-python-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "0ca03a4279144983ece765d691c49578248274eeef1ee988a921b616cf6849f1046e3e6660b5dd6b62a4f9f7744d3b89060bd8188cf707aa66d97776befae7d0"

RPROVIDES:${PN} += "syslog-ng-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
