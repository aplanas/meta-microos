SUMMARY = "The Syslog daemon"
DESCRIPTION = "The syslogd daemon is the general system logging daemon, which is \
responsible for handling requests for syslog services. \
 \
This version of syslogd is similar to the standard Berkeley product, \
but with a number of compatible extensions."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "syslogd-1.5.1-802.4.aarch64.rpm"
RPM_HASH = "cbee6ca59a14baafb5bc4662f2fc98e7d6ee557429b73af031a19a800304f15b6f52adea2a6bb3d5f09fc2bf7ce8b622c74d2450f96d2859e9368e87acabe500"

RPROVIDES:${PN} += "config-syslogd \
sysklogd \
syslog \
syslogd \
sysvinit-syslog"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-news \
klogd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
permissions \
syslog-service \
systemd \
user-news"

inherit rpm
