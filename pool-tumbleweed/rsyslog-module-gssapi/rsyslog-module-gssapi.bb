SUMMARY = "GSS-API support module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides the support to receive syslog messages from the \
network protected via Kerberos 5 encryption and authentication."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-gssapi-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "008cf313faf119af44a8ac101f3e0bcdf691b695d0d337763b9646ea68a8939a89e079840e7d076b90f5e6ec2ab5521b2cbbe04036f4daf46373157ee333d864"

RPROVIDES:${PN} += "rsyslog-module-gssapi \
rsyslog-module-gssapi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
rsyslog"

inherit rpm
