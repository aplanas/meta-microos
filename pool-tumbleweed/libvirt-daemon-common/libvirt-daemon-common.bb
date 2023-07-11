SUMMARY = "Files and utilities used by daemons"
DESCRIPTION = "Miscellaneous files and utilities used by other libvirt daemons"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-common-9.4.0-3.1.aarch64.rpm"
RPM_HASH = "b2672774fb921a73afa08a6e7f992908a417f8e75b18b91ae927e464f8868e0a4e69f07082d0b52f8e147783969fa29f9a2d452a60ae1faaf0449e37f01600b5"

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
