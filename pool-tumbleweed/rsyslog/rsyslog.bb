SUMMARY = "The enhanced syslogd for Linux and Unix"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslogd supporting, among others, \
MySQL, syslog/tcp, RFC 3195, permitted sender lists, filtering on any \
message part, and fine grain output format control. It is quite \
compatible to stock sysklogd and can be used as a drop-in replacement. \
Its advanced features make it suitable for enterprise-class, encryption \
protected syslog relay chains while at the same time being very easy to \
setup for the novice user."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "d77dc7f7313e6948698a98b7992988c7d7b7005dfd8fbf88b8c248e24af48f7691a1055ee83ee00d03cbaffb74ff2763c3806c8cbeb174db9a8e3f0af42751b8"

RPROVIDES:${PN} += "config-rsyslog \
rsyslog \
syslog \
sysvinit-syslog"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libestr.so.0 \
libfastjson.so.4 \
liblogging-rfc3195.so.0 \
liblognorm.so.5 \
libm.so.6 \
librdkafka1 \
libsystemd.so.0 \
libuuid.so.1 \
libz.so.1 \
syslog-service"

inherit rpm
