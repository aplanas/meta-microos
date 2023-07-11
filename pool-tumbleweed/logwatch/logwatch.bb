SUMMARY = "Tool to analyze and report on system logs"
DESCRIPTION = "Logwatch is a customizable, pluggable log-monitoring system. It will go \
through system logs for a given period of time and make a report for the \
desired areas at the desired detail level."
LICENSE = "MIT"

PV = "7.8"

RPM_NAME = "logwatch-7.8-1.1.noarch.rpm"
RPM_HASH = "e0e655caacaa1827f38591c731387bf7c1970fe5208aa2a7581b165e4aabdc43b6290d788e2ad2b82ecd0a79c3276a4f917bda9f97e4e8c87bb89cc7dac6a54f"
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
