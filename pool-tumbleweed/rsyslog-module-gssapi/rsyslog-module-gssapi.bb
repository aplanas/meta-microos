SUMMARY = "GSS-API support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support to receive syslog messages from the \
network protected via Kerberos 5 encryption and authentication."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-gssapi-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "b3ad94d2fca1a9b9f19b0d8bb2343d48faee76aefd6654ada21218b58172c5e0e0b8043653ab52fc47b6427d4ac0c391114487a212eb00f1c63fb65726317de3"

RPROVIDES:${PN} += "rsyslog-module-gssapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
rsyslog"

inherit rpm
