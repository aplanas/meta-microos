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

RPM_NAME = "systemd-container-253.8-1.2.aarch64.rpm"
RPM_HASH = "1058048f1c33acdc7d2dcf1f2a024caee3d1239fc63127a551bc24e735d7c9fec63413bc4028fbeac2a641014f96d7e28c49805a9111561f4b56150d04bacd6e"

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
