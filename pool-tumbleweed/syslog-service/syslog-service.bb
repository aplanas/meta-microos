SUMMARY = "Syslog service files & scripts"
DESCRIPTION = "The package syslog-service provides the service boot \
scripts for SysV and the service unit files for systemd."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "syslog-service-2.0-802.3.noarch.rpm"
RPM_HASH = "d541858b72a73b2201974ff38087720149a5127e0234b4bf606b12f155b355c32e84925886b735e156652142e27c8e4c058889fca41c2af89e3fb017824ca863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syslog-service"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
logrotate \
syslog \
sysvinit-network"

inherit rpm
