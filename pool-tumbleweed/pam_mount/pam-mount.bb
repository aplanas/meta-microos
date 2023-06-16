SUMMARY = "A PAM Module that can Mount Volumes for a User Session"
DESCRIPTION = "This module is aimed at environments with central file servers that a \
user wishes to mount on login and unmount on logout, such as \
(semi-)diskless stations where many users can logon. \
 \
The module also supports mounting local filesystems of any kind the \
normal mount utility supports, with extra code to make sure certain \
volumes are set up properly because often they need more than just a \
mount call, such as encrypted volumes. This includes SMB/CIFS, FUSE, \
dm-crypt and LUKS."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.19"

RPM_NAME = "pam_mount-2.19-2.3.aarch64.rpm"
RPM_HASH = "da5f95d2ddd5e763244f90bc620905696b6fead2c8848243f36fa241fd68a77d3cb8ab0bd6194a294f0ad78c9a9feae57131b8b598b7127743912ea63441d5c9"

RPROVIDES:${PN} += "config-pam-mount \
pam-mount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
device-mapper \
fd0ssh \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libcryptmount.so.0 \
libcryptsetup.so.12 \
libmount.so.1 \
libpam.so.0 \
libpcre2-8.so.0 \
libxml2.so.2 \
ofl \
perl-XML-Parser \
perl-XML-Writer \
util-linux"

inherit rpm
