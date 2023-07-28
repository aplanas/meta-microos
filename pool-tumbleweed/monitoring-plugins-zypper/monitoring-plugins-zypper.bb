SUMMARY = "Check for software updates via zypper"
DESCRIPTION = "This plugin checks for software updates on systems that use package \
management systems based on the zypper command found in (open)SUSE. \
 \
It checks for security, recommended and optional patches and also for \
optional package updates. \
 \
You can define the status by patch category. Use a commata to list more \
than one category to a state. \
 \
If you like to know the names of available patches and packages, use \
the '-v' option."
LICENSE = "BSD-3-Clause"

PV = "1.98.10"

RPM_NAME = "monitoring-plugins-zypper-1.98.10-1.1.noarch.rpm"
RPM_HASH = "22c70df70249927cdd08f78044c9c95c00fe3abcf621d72c1a3d010863ba4d494349b67b0f124b4ffde980e0ca84f0f137377ce01c8a94a546aa9235d402d284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-zypper \
monitoring-plugins-zypper \
nagios-plugins-zypper"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apparmor-abstractions \
gawk \
grep \
perl-Getopt--Long \
perl-POSIX \
perl-Time--Local \
rpm \
sudo \
systemd \
zypper"

inherit rpm
