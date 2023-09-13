SUMMARY = "Tool to analyze and report on system logs"
DESCRIPTION = "Logwatch is a customizable, pluggable log-monitoring system. It will go \
through system logs for a given period of time and make a report for the \
desired areas at the desired detail level."
LICENSE = "MIT"

PV = "7.9"

RPM_NAME = "logwatch-7.9-1.1.noarch.rpm"
RPM_HASH = "004f9d43096c77060a0208c668b5f65ef952db63710aeeb742fd86cb694b384a6b286a9da72532918e03baf80184c42843c04cf384dc989cfcd1a7c6d076b392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-logwatch \
logwatch \
perl-Logwatch"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
grep \
mailx \
perl \
perl-Date-Manip \
sh-utils \
systemd \
textutils"

inherit rpm
