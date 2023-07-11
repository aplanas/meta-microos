SUMMARY = "Perl Module Interface to Rsync(1) F<Http://Rsync.Samba.Org/Rsync/>"
DESCRIPTION = "Perl Convenience wrapper for the rsync(1) program. Written for \
_rsync-2.3.2_ and updated for _rsync-3.1.1_ but should perform properly \
with most recent versions."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.49"

RPM_NAME = "perl-File-Rsync-0.49-1.25.noarch.rpm"
RPM_HASH = "34595466f01b85eeec7b2919451bf93107f5e198f03de2a612fe3cd5106d8ecb834dc7791cb7fb3a4071a87eb51f1bd42ae09a24120b6c856d8ec01d8853644d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Rsync \
perl-File-Rsync"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IPC--Run3 \
rsync"

inherit rpm
