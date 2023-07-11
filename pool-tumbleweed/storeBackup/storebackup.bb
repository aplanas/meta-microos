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

RPM_NAME = "storeBackup-3.5-13.7.noarch.rpm"
RPM_HASH = "8c733e017fdd104225f35701b3a4bd622f84724285f4deed1c90046d5f46518ccb4d0146707c75822b6323c6a7f04fb2e5499f845883c2783654a926b786abc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "storeBackup"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
bzip2 \
e2fsprogs \
fileutils \
sh-utils \
textutils \
which"

inherit rpm
