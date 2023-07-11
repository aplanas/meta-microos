SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the GnuTLS library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-gtls-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "36c598b2d702d39566d76bfb0b20fb77c4193ed23a876bd5d4d83ff7117e18ba881be3211594a28f62eacbba3855a852a97fbf5eaa699c6cbd73396e43c997f4"

RPROVIDES:${PN} += "rsyslog-module-gtls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
rsyslog"

inherit rpm
