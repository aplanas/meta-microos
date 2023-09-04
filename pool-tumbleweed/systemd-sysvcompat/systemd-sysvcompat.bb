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

PV = "253.8"

RPM_NAME = "systemd-sysvcompat-253.8-1.2.aarch64.rpm"
RPM_HASH = "e5599b16fb1cb6fc6743a3a9571c481a88841ed16f3ac91469c2eff1aece933bd62071c956be5fbc07bcbc8b6370c1f15dcf7c3dbac348de3e0d1d06b27c8e9e"

RPROVIDES:${PN} += "systemd-sysvcompat \
systemd-sysvinit-/usr/sbin/runlevel \
systemd-sysvinit-/usr/sbin/telinit"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd-shared-253.so \
systemd"

inherit rpm
