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

RPM_NAME = "systemd-container-253.7-1.2.aarch64.rpm"
RPM_HASH = "4dad271299c4746bc93c410cb27b499306ee03c7b5358ab753fd5f8378d8d76daa6c2059c562a60f232d5d0f72ff4174e65203f8e5f68fb62ce7b86fb06787c4"

RPROVIDES:${PN} += "libnss-mymachines.so.2 \
nss-mymachines \
systemd-/usr/bin/systemd-nspawn \
systemd-container"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/gpg \
/usr/bin/sh \
/usr/bin/tar \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libcurl.so.4 \
libgcrypt.so.20 \
liblzma.so.5 \
libseccomp.so.2 \
libselinux.so.1 \
libsystemd-shared-253.so \
libz.so.1 \
systemd"

inherit rpm
