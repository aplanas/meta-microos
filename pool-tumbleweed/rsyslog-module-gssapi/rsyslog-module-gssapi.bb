SUMMARY = "GSS-API support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support to receive syslog messages from the \
network protected via Kerberos 5 encryption and authentication."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-gssapi-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "744072f39af08bb26e1b47b97ac514d40e34f385625dc035393f0c811b79b24f89e49a9c932cbba3282e891ef9eb7bf10a00f500c7e0ba3cb79bcd1a945609ba"

RPROVIDES:${PN} += "rsyslog-module-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
rsyslog"

inherit rpm
