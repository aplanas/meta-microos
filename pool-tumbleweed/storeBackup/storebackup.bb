SUMMARY = "A disk-to-disk backup tool for Linux"
DESCRIPTION = "storeBackup is a disk-to-disk backup tool. The backuped files can be \
directly browsed (locally, via NFS, via SAMBA or whatever). This \
gives the users the possibility to restore files. They only have to \
copy (and possibly uncompress) the file. The is also a tool for \
restoring (sub) trees for the administrator. Every single backup of a \
specific time can be deleted without affecting the other existing \
backups. \
 \
Before you can start using storeBackup, please carefully read \
        /usr/share/doc/packages/storeBackup/README.1ST \
and create an appropriate configuration file \
        /etc/storebackup.d/storebackup.config \
using \
        /usr/share/doc/packages/storeBackup/storebackup.config.default \
as a template."
LICENSE = "GPL-3.0-or-later"

PV = "3.5"

RPM_NAME = "storeBackup-3.5-13.6.noarch.rpm"
RPM_HASH = "d13e3d2f6f36b33a6e71a53f1bc85c467dc8a7b720d781cbd0b5ecde27d420a8562748603788d9b6aa2b989e5fd99f624d6b5b2bf59749c8547e3c032dcb3808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "storeBackup"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
bzip2 \
e2fsprogs \
fileutils \
sh-utils \
textutils \
which"

inherit rpm
