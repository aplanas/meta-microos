SUMMARY = "AMQP support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for AMQP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-omamqp1-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "a4cd38451edcaa21a831ddd6a9736fdcb9786c319f522f4510b3d3aef2baeda5d4b0d0ddae037b63fb1b2d6cf47cafc549071af2f5894f5ff6a9df271ee88e99"

RPROVIDES:${PN} += "rsyslog-module-omamqp1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqpid-proton.so.11 \
rsyslog"

inherit rpm
