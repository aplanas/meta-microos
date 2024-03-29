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

PV = "1.98.11"

RPM_NAME = "monitoring-plugins-zypper-1.98.11-1.1.noarch.rpm"
RPM_HASH = "8d914201850f6501fe6c3efef82146185a6a9f66f44a45d0f8bfb2d5028fdc9d9a3bb2ecfc9fbee9a6f39c74874cdb4f603d4182a36fe11c741127bf2f88f44c"
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
