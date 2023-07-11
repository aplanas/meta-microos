SUMMARY = "AMQP support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for AMQP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-omamqp1-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "2831ae2824524f2020dc28aeb08b85754dee39189bc499bbfdc15a48b46635a11a408680bc5cce2e95a49e603a99ac88164cc04f29b78dc0199fcdbe265dfb76"

RPROVIDES:${PN} += "rsyslog-module-omamqp1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqpid-proton.so.11 \
rsyslog"

inherit rpm
