SUMMARY = "TLS encryption support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the ability for TLS encrypted TCP logging using \
the GnuTLS library."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-gtls-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "abe9d3d035f4ae75b76c2191b2fd2fbaf2dc39bca2ca1cbd2e08074e28a63d2d4cbacaf0e70df29fbeeddc8380d972df47e2975c7eae0d31d5bf1648fe29437f"

RPROVIDES:${PN} += "rsyslog-module-gtls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
rsyslog"

inherit rpm
