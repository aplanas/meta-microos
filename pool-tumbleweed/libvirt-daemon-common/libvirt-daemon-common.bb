SUMMARY = "Files and utilities used by daemons"
DESCRIPTION = "Miscellaneous files and utilities used by other libvirt daemons"
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.0"

RPM_NAME = "libvirt-daemon-common-9.5.0-1.1.aarch64.rpm"
RPM_HASH = "94e6cc50a4870cfdec30a2acb6ed7c3721ae836a1db2cc0d3cffe9f2e6940889a2e2c328ef18b2d6fd7e071cd1d1e617262d2e7f51e4055f1139263c2634327b"

RPROVIDES:${PN} += "config-libvirt-daemon-common \
libvirt-admin \
libvirt-daemon-common"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash-completion \
dbus-1 \
dmidecode \
gettext-runtime \
group-libvirt \
iproute \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libreadline.so.8 \
libvirt-admin.so.0 \
libvirt-libs \
libvirt.so.0 \
libxml2.so.2 \
logrotate \
pkgconfig-udev \
systemd"

inherit rpm
