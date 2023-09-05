SUMMARY = "Git tools for importing Subversion repositories"
DESCRIPTION = "Tools for importing Subversion repositories to the Git version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-svn-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "55a9045033a19da2e1cb9a41f736e3912c14d6566a4af19aade7f0c424aaa0b7c29e6ac6fcdbb65a8148e5efe49255b4ecc6e4fa7bc768979dad1ec83b64a43f"

RPROVIDES:${PN} += "git-svn"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Git \
perl-Term-ReadKey \
subversion \
subversion-perl"

inherit rpm
