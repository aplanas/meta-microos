SUMMARY = "SySV and LSB init script support for systemd (deprecated)"
DESCRIPTION = "This package ships the necessary files that enable minimal SysV and LSB init \
scripts support in systemd. It also contains the obsolete SysV init tools \
telinit(8) and runlevel(8). You should consider using systemctl(1) instead. \
 \
Unless you have a 3rd party application installed on your system that still \
relies on such scripts, this package should not be needed at all. \
 \
Please note that the content of this package is considered as deprecated."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-sysvcompat-253.7-1.2.aarch64.rpm"
RPM_HASH = "81643398ba6f03ee0ea35c75d773df16c2934abf90477130e14c1ce3f1bc16c69a6517c174a4bfab5c3648fceb670528ec7820d038a0133b3dc6172fab1eb1ce"

RPROVIDES:${PN} += "systemd-sysvcompat \
systemd-sysvinit-/usr/sbin/runlevel \
systemd-sysvinit-/usr/sbin/telinit"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-253.so \
systemd"

inherit rpm
