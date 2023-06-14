SUMMARY = "Plugin for monitoring DRBD 9 resources"
DESCRIPTION = "This package contains monitoring plugins for monitoring DRBD resources. \
 \
The plugins use output from the following sources to determine the state of each resource: \
* /proc/drbd \
* /usr/sbin/drbdadm sh-resources \
* /usr/sbin/drbdetup events2 --now --statistics \
 \
The following DRBD kernel modules and DRBD Utilities are supported: \
* DRBD 8.4.x with drbd-utils 8.9.6 \
* DRBD 9.0.x with drbd-utils 8.9.6"
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "monitoring-plugins-drbd9-0.1-1.15.noarch.rpm"
RPM_HASH = "de5c277a8675412f82c9440f818fe3b5d38f5a0ed3382024b3ee342dc60532e8a2226e94699895a99250e1ef4da8aad08073afcd8e68540f2a5a31652093f2a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-drbd9"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Data--Dumper \
perl-Getopt--Std"

inherit rpm
