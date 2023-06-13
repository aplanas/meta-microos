SUMMARY = "Git tools for importing CVS repositories"
DESCRIPTION = "Tools for importing CVS repositories to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-cvs-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "67e7a50a30a26e6cf26d895d032efe4a568a75f8305e26551e6d3c5436830187e0f6a424c77b7b42c76e9dfce2fca5148154a83fb049299b7465d694ce7737fd"

RPROVIDES:${PN} += "git-cvs \
git-cvs(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
cvs \
cvsps \
git-core \
perl-DBD-SQLite \
perl-Git"

inherit rpm
