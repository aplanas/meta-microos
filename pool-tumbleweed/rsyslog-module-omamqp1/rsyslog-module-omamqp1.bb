SUMMARY = "AMQP support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for AMQP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-omamqp1-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "da485ca64da7ca280b2a73df5305af4ab03027633b09b723b81e9b91872266afe9b45c5cf9dbc44555be5af0c13e15bd1ffe14761a3bede952d5d180de51eb84"

RPROVIDES:${PN} += "rsyslog-module-omamqp1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqpid-proton.so.11 \
rsyslog"

inherit rpm
