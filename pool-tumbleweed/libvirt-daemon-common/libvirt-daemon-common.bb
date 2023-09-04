SUMMARY = "Files and utilities used by daemons"
DESCRIPTION = "Miscellaneous files and utilities used by other libvirt daemons"
LICENSE = "LGPL-2.1-or-later"

PV = "9.6.0"

RPM_NAME = "libvirt-daemon-common-9.6.0-2.1.aarch64.rpm"
RPM_HASH = "f8755e904ce76ea09eadb9f3453429bf9fe967e733419dc5eee1975a01cad20f41cf6d6b400512d4e11fad1494e62d0762136bc4bbfb79321b1f9301a41c2f9a"

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
