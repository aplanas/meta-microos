SUMMARY = "Enhanced system logging daemon"
DESCRIPTION = "syslog-ng is an enhanced log daemon, supporting a wide range of input and \
output methods: syslog, unstructured text, message queues, databases (SQL \
and NoSQL alike) and more. \
 \
Key features: \
 \
 * receive and send RFC3164 and RFC5424 style syslog messages \
 * work with any kind of unstructured data \
 * receive and send JSON formatted messages \
 * classify and structure logs with builtin parsers (csv-parser(), \
   db-parser(), ...) \
 * normalize, crunch and process logs as they flow through the system \
 * hand on messages for further processing using message queues (like \
   AMQP), files or databases (like PostgreSQL or MongoDB)."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "028f01e160aea009037d707baf6311525a2d3307261e83decb8927519ce7e5cad46f70136cb70458d1a6f8fc7c029119c8ce93bdf844175d1c6ca72574ddb3cb"

RPROVIDES:${PN} += "config-syslog-ng \
libloggen-helper-4.2.so.0 \
libloggen-plugin-4.2.so.0 \
libsecret-storage.so.0 \
libsyslog-ng-4.2.so.0 \
syslog \
syslog-ng \
sysvinit-syslog"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libevtlog-4.2.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libjson-c.so.5 \
libnet.so.9 \
libpcre.so.1 \
libssl.so.3 \
libsystemd.so.0 \
libwrap.so.0 \
syslog-service"

inherit rpm
