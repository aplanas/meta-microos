SUMMARY = "Tool to analyze and report on system logs"
DESCRIPTION = "Logwatch is a customizable, pluggable log-monitoring system. It will go \
through system logs for a given period of time and make a report for the \
desired areas at the desired detail level."
LICENSE = "MIT"

PV = "7.7"

RPM_NAME = "logwatch-7.7-1.2.noarch.rpm"
RPM_HASH = "8a003c6c9548bd30359d87c71c9d7b0fcc012376e7f72cba6b4e8dd00a360e7c3474235cb81f9500aa44ea8903e741752b1f96fc01dd34f9fd3bf7dad7319ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-logwatch \
logwatch \
perl-Logwatch"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
grep \
mailx \
perl \
perl-Date-Manip \
sh-utils \
systemd \
textutils"

inherit rpm
