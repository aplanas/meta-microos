SUMMARY = "Systemd tools for container management"
DESCRIPTION = "Systemd tools to spawn and manage containers and virtual machines. \
 \
In addition, it also contains a plugin for the Name Service Switch (NSS), \
providing host name resolution for all local containers and virtual machines \
using network namespacing and registered with systemd-machined. It also maps \
UID/GIDs ranges used by containers to useful names. \
 \
To activate this NSS module, you will need to include it in /etc/nsswitch.conf, \
see nss-mymachines(8) manpage for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "systemd-mini-container-253.7-1.1.aarch64.rpm"
RPM_HASH = "64629fbdbef2c7be4e8f4f63f90e630b321b9f8df175c7e33f790b5d961b85fc39e31125ee74a1ec354ec38b8cb0595dd03bf6e0a9f9e0dcc61f8628c0be2e81"

RPROVIDES:${PN} += "nss-mymachines \
systemd-/usr/bin/systemd-nspawn \
systemd-container \
systemd-mini-container"

RDEPENDS:${PN} += "/usr/bin/gpg \
/usr/bin/sh \
/usr/bin/tar \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libsystemd-shared-253.so \
systemd \
systemd-mini"

inherit rpm
