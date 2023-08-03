SUMMARY = "Tool to analyze and report on system logs"
DESCRIPTION = "Logwatch is a customizable, pluggable log-monitoring system. It will go \
through system logs for a given period of time and make a report for the \
desired areas at the desired detail level."
LICENSE = "MIT"

PV = "7.8"

RPM_NAME = "logwatch-7.8-2.1.noarch.rpm"
RPM_HASH = "1146b4d44d0beb1acf3ba4e6ddb16c6453a7a14b414412b4a83490f78c1f40a27da1df123e518785643542dfb3eeb715278e1a8fede23c8d35010e85b19c1634"
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
