SUMMARY = "Contains the mmnormalize support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides log normalizing support."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-mmnormalize-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "f86c5d2c443de943a254d8ed01d7fae1077ffc73adfe51e844440a58d1cbb61187c472e8e776c29c4af95e9881b3d9471cc16e127b6b38f255cea2fff6578afa"

RPROVIDES:${PN} += "rsyslog-module-mmnormalize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastjson.so.4 \
liblognorm.so.5 \
rsyslog"

inherit rpm
