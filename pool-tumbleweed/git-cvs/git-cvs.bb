SUMMARY = "Git tools for importing CVS repositories"
DESCRIPTION = "Tools for importing CVS repositories to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-cvs-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "fd8c273d7fb7957cb7d3d57975c0a7fa067d8b0d364d48b164aca9cc5b8d4c89d53d11aba6c4a74f469757d1d4a05e8f8669fe7d7a2b2cf45627e032d450fb04"

RPROVIDES:${PN} += "git-cvs"

RDEPENDS:${PN} += "/usr/bin/perl \
cvs \
cvsps \
git-core \
perl-DBD-SQLite \
perl-Git"

inherit rpm
