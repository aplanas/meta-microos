SUMMARY = "Java destination support for syslog-ng"
DESCRIPTION = "This package provides Java destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-java-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "150f096ea89d9e26a813da24933c3668c3489ff80546ca01d5370848bc76fe030468c3279aa25bb3abc8ee3a12f06ef8b691ec9e5440c2381c0481ce1339ad1e"

RPROVIDES:${PN} += "syslog-ng-java"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
