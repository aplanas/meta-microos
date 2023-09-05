SUMMARY = "Git tools for importing CVS repositories"
DESCRIPTION = "Tools for importing CVS repositories to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-cvs-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "7e2e340d9d7726a1d73d8ee3ad7e7953afcbf4e554381ef31c62e0e246f0082ae02913978528b9a01a51f01ee163eefde4432e32ff3a97ae7a4ebf15785d9824"

RPROVIDES:${PN} += "git-cvs"

RDEPENDS:${PN} += "/usr/bin/perl \
cvs \
cvsps \
git-core \
perl-DBD-SQLite \
perl-Git"

inherit rpm
