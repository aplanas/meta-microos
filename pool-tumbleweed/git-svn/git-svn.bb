SUMMARY = "Git tools for importing Subversion repositories"
DESCRIPTION = "Tools for importing Subversion repositories to the Git version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-svn-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "e3e032ee4d074f3281f2eec2ecb46d5f6b6b627b29046bc69af30898da309dc50421d11910d1142288a114641971dfd59148a3e70c285057517719f298951d09"

RPROVIDES:${PN} += "git-svn"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Git \
perl-Term-ReadKey \
subversion \
subversion-perl"

inherit rpm
