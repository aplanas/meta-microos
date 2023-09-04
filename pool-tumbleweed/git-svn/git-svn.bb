SUMMARY = "Git tools for importing Subversion repositories"
DESCRIPTION = "Tools for importing Subversion repositories to the Git version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-svn-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "1d2d2ce33d82246dcfe7c7a83f08cf0e43d77a1d1662d23bd616b6ced5af3ea09f338e1faf4fd779184e46eef6f04c3df08395e93a203c4c5b13a2772cffd816"

RPROVIDES:${PN} += "git-svn"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core \
perl-Git \
perl-Term-ReadKey \
subversion \
subversion-perl"

inherit rpm
