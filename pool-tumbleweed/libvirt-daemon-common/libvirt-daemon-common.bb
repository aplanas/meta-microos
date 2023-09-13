SUMMARY = "Files and utilities used by daemons"
DESCRIPTION = "Miscellaneous files and utilities used by other libvirt daemons"
LICENSE = "LGPL-2.1-or-later"

PV = "9.7.0"

RPM_NAME = "libvirt-daemon-common-9.7.0-1.1.aarch64.rpm"
RPM_HASH = "aca959c0ecfb99384d2e87db2171c154d73cf5914f4cdb24f5f5701eab174ef4a08e8ab7b7a626fb3029f230358ba997d137986a4454e56e933c321ce809cd84"

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
