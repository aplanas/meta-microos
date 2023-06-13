SUMMARY = "Libgcrypt log file encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log file encryption support using libgcrypt and \
a rsgtutil utility to manage the files."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-gcrypt-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "750bff087343852d50159132b53c08aa808671d8c8bda22b7b53fb5128de339c9de604f434aa0be88eb975b55758f3e2c7c3e1095b05f840eaaa12d99b807cb5"

RPROVIDES:${PN} += "rsyslog-module-gcrypt \
rsyslog-module-gcrypt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit) \
rsyslog"

inherit rpm
