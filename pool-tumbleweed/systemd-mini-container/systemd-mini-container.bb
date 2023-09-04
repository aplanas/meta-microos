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

PV = "253.8"

RPM_NAME = "systemd-mini-container-253.8-1.1.aarch64.rpm"
RPM_HASH = "f035e6318e68d5c95707b87d203e298a41d692c4379bc26a1b3275c341b305566387cc611866c5e0daf14125e8944e13e4b093ac7d7d884938b5be142d743929"

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
