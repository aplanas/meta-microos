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

PV = "253.5"

RPM_NAME = "systemd-mini-container-253.5-5.1.aarch64.rpm"
RPM_HASH = "059ca6c95643f6cf942a6fcce482e684126f4e71fe6d6e14b6b2c0c6aa74e937d59bfdd4e5c7ebb67aec34c585099ce64cfca681d7712c2563d622b244b32c1a"

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
