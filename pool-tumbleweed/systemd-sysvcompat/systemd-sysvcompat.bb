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

RPM_NAME = "systemd-sysvcompat-253.7-2.1.aarch64.rpm"
RPM_HASH = "51fad68d5f5564176af81e5c09979c27ebce32689731ad090f017a69e28fa9ca2f1bec1c1c867acbbf0e3679dfbaebeddb069ead282fb24ce7d5559c4c4b8531"

RPROVIDES:${PN} += "systemd-sysvcompat \
systemd-sysvinit-/usr/sbin/runlevel \
systemd-sysvinit-/usr/sbin/telinit"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-253.so \
systemd"

inherit rpm
