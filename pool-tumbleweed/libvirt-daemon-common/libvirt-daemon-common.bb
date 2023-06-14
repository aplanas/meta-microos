SUMMARY = "Files and utilities used by daemons"
DESCRIPTION = "Miscellaneous files and utilities used by other libvirt daemons"
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.0"

RPM_NAME = "libvirt-daemon-common-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "432b66f8d3e64d745ac91d998dcd69a85ba0db40f2280cea0278e967b8bcd20549fbb2d153bedfe89f1630ffaf67d26dfe8342b26eaa9765dc0bad905b46a211"

RPROVIDES:${PN} += "config-libvirt-daemon-common \
libvirt-admin \
libvirt-daemon-common"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
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
