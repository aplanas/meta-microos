SUMMARY = "Kafka support module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support for Kafka."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-kafka-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "158e80e3b0a8faaa6607509751ec6f0642b1125fa9bc34f6aa26c7b3a2dbe0ea3e7ef4b6417c15dc1f4575e5f1fd53be0cdfc091429a01f628a8517ba6269a5b"

RPROVIDES:${PN} += "rsyslog-module-kafka"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdkafka.so.1 \
rsyslog"

inherit rpm
