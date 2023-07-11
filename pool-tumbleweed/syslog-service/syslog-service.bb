SUMMARY = "Syslog service files & scripts"
DESCRIPTION = "The package syslog-service provides the service boot \
scripts for SysV and the service unit files for systemd."
LICENSE = "GPL-2.0-or-later"

PV = "2.0"

RPM_NAME = "syslog-service-2.0-802.4.noarch.rpm"
RPM_HASH = "ad83f5a222cf6f60362858d0f636d7f268f1f7ed0068efca0a0b457792d53473a5626008edc086ba8ceb854c26245e019ab8bff5a85a9dc85683f83875167743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "syslog-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
logrotate \
syslog \
sysvinit-network"

inherit rpm
