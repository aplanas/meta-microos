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

PV = "253.5"

RPM_NAME = "systemd-sysvcompat-253.5-5.1.aarch64.rpm"
RPM_HASH = "56e20a4f14939f2c740c3fe2c2f93f763c878e4b756d1be7e7d3e946b4db1dc8a66ad832c92b4c26c865b4c61bd5b52a73b53022d249cdb57daf02f85e3dbb36"

RPROVIDES:${PN} += "systemd-sysvcompat \
systemd-sysvinit-/usr/sbin/runlevel \
systemd-sysvinit-/usr/sbin/telinit"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-253.so \
systemd"

inherit rpm
