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

PV = "1.98.9"

RPM_NAME = "monitoring-plugins-zypper-1.98.9-1.1.noarch.rpm"
RPM_HASH = "df3439bb3805994f3cee1ccd4bba12270c197c5412ccefa5179ca153b45f34f58f580180b359e0231e90e0d80baa3d5361215f3d6eb0b1fcf7d2cbcbb78c449a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(monitoring-plugins-zypper) \
monitoring-plugins-zypper \
nagios-plugins-zypper"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
apparmor-abstractions \
gawk \
grep \
perl(Getopt::Long) \
perl(POSIX) \
perl(Time::Local) \
rpm \
sudo \
systemd \
zypper"

inherit rpm
