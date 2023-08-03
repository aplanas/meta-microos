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

RPM_NAME = "systemd-mini-container-253.7-2.1.aarch64.rpm"
RPM_HASH = "7dca94e0b54107aad3787a6fe570a1b2a043df8de939e8520a9b3157aeba148f3c546993cbfd4e08190d1f1c84899e89b5ff3a9193b76799d71c243eed605fc9"

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
