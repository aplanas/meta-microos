SUMMARY = "Check mail queues"
DESCRIPTION = "This plugin checks the number of messages in the mail queue (supports multiple \
sendmail queues, qmail)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mailq-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "0cddf1b0610c85a16bdf63b6242f49a6a8d544623a9be6f82edbe8a421b075bc72b7e629b89377ae65f8b5ca3f38b02f5ef0e70e2a7c7a24bea006d1343aa839"

RPROVIDES:${PN} += "config-monitoring-plugins-mailq \
monitoring-plugins-mailq \
nagios-plugins-mailq"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
smtp-daemon"

inherit rpm
