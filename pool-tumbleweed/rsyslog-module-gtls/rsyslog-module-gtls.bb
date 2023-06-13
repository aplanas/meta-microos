SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the GnuTLS library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-gtls-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "54d6cb910bb52f75ed8e8b78793fb4e456386b7e6f1380c4fc7ec36314147ecc4ae4c0cbed0da4dbb7b49f3e6dd8716f0124d063c9bce88246fdafc6afb35dad"

RPROVIDES:${PN} += "rsyslog-module-gtls \
rsyslog-module-gtls(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
rsyslog"

inherit rpm
