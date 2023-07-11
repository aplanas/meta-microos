SUMMARY = "Contains the mmnormalize support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log normalizing support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-mmnormalize-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "fdf0a752af3e8446385b08e245b3d67036a56684ec3a5893ff1c6b34a261e424fd8ce34f586e1f683e91d0637829ba1c8e1323865edcfdf7a1c2e013ef4301ad"

RPROVIDES:${PN} += "rsyslog-module-mmnormalize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastjson.so.4 \
liblognorm.so.5 \
rsyslog"

inherit rpm
