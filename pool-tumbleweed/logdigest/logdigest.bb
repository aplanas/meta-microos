SUMMARY = "Mail Digests of System Log Files to the System Administrator"
DESCRIPTION = "Logdigest, run by cron at night, greps through system log files \
(/var/log/messages, /var/log/mail, etc.) to find 'interesting' content. \
 \
Lines matching the regular expressions in /etc/logdigest/ignore are simply \
ignored. More expressions can be added to /etc/logdigest/ignore.local. \
See /etc/logdigest/config for some general settings. \
 \
The results are mailed to the sysadmin daily."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "logdigest-0.2.4-20.13.aarch64.rpm"
RPM_HASH = "b682cc41e57cc9ac0c2b640126b683cc5cb3db73a8e2c8c6fd1da8a4df68b70a5c544ead738037663aa4ba503019de3c13bbd97c32ca20a704a35632df9712c9"

RPROVIDES:${PN} += "config(logdigest) \
logdigest \
logdigest(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/chmod \
/bin/sh \
/bin/touch \
logtail"

inherit rpm
