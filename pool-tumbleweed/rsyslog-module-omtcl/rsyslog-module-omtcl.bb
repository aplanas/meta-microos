SUMMARY = "TCL output module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides an output module for TCL."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-omtcl-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "6d2d9012969be4caa1ab8196ca6051e5b33893998b12a440feb7e7f8546eca99895cdd60989d4cb0ee14c5d5e74d7a1923aabffdc09f900652c95aaf37f19758"

RPROVIDES:${PN} += "rsyslog-module-omtcl \
rsyslog-module-omtcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
rsyslog"

inherit rpm
