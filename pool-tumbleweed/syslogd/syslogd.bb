SUMMARY = "The Syslog daemon"
DESCRIPTION = "The syslogd daemon is the general system logging daemon, which is \
responsible for handling requests for syslog services. \
 \
This version of syslogd is similar to the standard Berkeley product, \
but with a number of compatible extensions."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "syslogd-1.5.1-802.3.aarch64.rpm"
RPM_HASH = "bf9ecfe7023818be5b5a4ef890e94a3a46354fa12fa37b2169a6a67a82d8c29e18e64403859ef5be1771ab4804881903bd27eb51ae333178599ab1b609006d13"

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
