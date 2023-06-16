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

PV = "253.4"

RPM_NAME = "systemd-mini-container-253.4-2.1.aarch64.rpm"
RPM_HASH = "191b8c17a7cbd63b82f86e4ac332e97c1a312e76a303b9ff643d032b732b42ed3489ef610b4b4463954167799c618306b07321a01a8783d26dd69f95248aba69"

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
