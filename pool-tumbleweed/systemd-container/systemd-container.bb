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

RPM_NAME = "systemd-container-253.4-2.1.aarch64.rpm"
RPM_HASH = "92b399d2ce044d9680b9b25293a24fee2752a647cf16ee09edd4aec0309509108da6e817d9324e5f232a07110ce9b40c23f8e532c946a71f24be292b0cd5169b"

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
