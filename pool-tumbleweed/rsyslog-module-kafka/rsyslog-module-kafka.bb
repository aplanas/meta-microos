SUMMARY = "Kafka support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for Kafka."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-kafka-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "5c6d75e704b97aea742148d10ce218facf0f69d188c9851747e977951c735d4c8a875bd7cd4f943c54eb57c81c686d7fd25d914fc7ae4164620852b8b4f596e8"

RPROVIDES:${PN} += "rsyslog-module-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
rsyslog"

inherit rpm
