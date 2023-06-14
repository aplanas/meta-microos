SUMMARY = "Perl Module Interface to Rsync(1) F<Http://Rsync.Samba.Org/Rsync/>"
DESCRIPTION = "Perl Convenience wrapper for the rsync(1) program. Written for \
_rsync-2.3.2_ and updated for _rsync-3.1.1_ but should perform properly \
with most recent versions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.49"

RPM_NAME = "perl-File-Rsync-0.49-1.24.noarch.rpm"
RPM_HASH = "08a43fa8d2bfb1de231115f395f011ed1de9c708b3134b15e93a92e1102384a67c6781ce916ee044909252ed4d300730ff1202ba729d05ed38d93df8e25c7cf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Rsync \
perl-File-Rsync"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-IPC--Run3 \
rsync"

inherit rpm
