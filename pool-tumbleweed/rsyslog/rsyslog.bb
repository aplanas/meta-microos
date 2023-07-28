SUMMARY = "The enhanced syslogd for Linux and Unix"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslogd supporting, among others, \
MySQL, syslog/tcp, RFC 3195, permitted sender lists, filtering on any \
message part, and fine grain output format control. It is quite \
compatible to stock sysklogd and can be used as a drop-in replacement. \
Its advanced features make it suitable for enterprise-class, encryption \
protected syslog relay chains while at the same time being very easy to \
setup for the novice user."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "d9108a815bf77158dc7d3772d0affdf64b15d7e1d061f349cd84d60004703c18fad2c594d43ce9e68d1c36542e54e5ca0691729fe8ef40fedc32684902a25d1b"

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
