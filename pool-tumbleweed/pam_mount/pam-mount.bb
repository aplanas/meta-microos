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

PV = "2.20"

RPM_NAME = "pam_mount-2.20-1.1.aarch64.rpm"
RPM_HASH = "25e8efae9214ecda41b6062e424a374dd0fa2ba45d68293581b3a9d8455ec83314084515bbcdc52a3446f53381d8141653d38eb60df7b7e21c13b03baf418f68"

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
