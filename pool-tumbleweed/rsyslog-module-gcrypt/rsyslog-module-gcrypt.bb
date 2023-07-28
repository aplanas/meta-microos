SUMMARY = "Libgcrypt log file encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log file encryption support using libgcrypt and \
a rsgtutil utility to manage the files."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-gcrypt-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "7224fd68e1922c5d74c1140a7ce887e5660dce14c136c106e484cb535dff99290cfab660578ef5d926d7a43fe91890763c665b4c90524e67612d4c526ed324c7"

RPROVIDES:${PN} += "rsyslog-module-gcrypt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
rsyslog"

inherit rpm
