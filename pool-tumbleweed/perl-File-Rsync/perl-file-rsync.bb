SUMMARY = "Perl Module Interface to Rsync(1) F<Http://Rsync.Samba.Org/Rsync/>"
DESCRIPTION = "Perl Convenience wrapper for the rsync(1) program. Written for \
_rsync-2.3.2_ and updated for _rsync-3.1.1_ but should perform properly \
with most recent versions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.49"

RPM_NAME = "perl-File-Rsync-0.49-1.26.noarch.rpm"
RPM_HASH = "cd3f2d7e844c244a7595766b7dc44f982dd5575f1d1a679ed102af48c9a02c8869213f0b1a9f12612d049ed859a77827a7b3243473a0560d7348c0434c88a3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Rsync \
perl-File-Rsync"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IPC--Run3 \
rsync"

inherit rpm
