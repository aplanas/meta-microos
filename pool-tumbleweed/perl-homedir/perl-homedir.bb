SUMMARY = "Per-user Perl local::lib setup"
DESCRIPTION = "perl-homedir configures the system to automatically create a ~/perl5 \
directory in each user's $HOME on user login.  This allows each user to \
install and CPAN packages via the CPAN to their $HOME, with no additional \
configuration or privliges, and without installing them system-wide. \
 \
If you want your users to be able to install and use their own Perl modules, \
install this package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000024"

RPM_NAME = "perl-homedir-2.000024-2.9.noarch.rpm"
RPM_HASH = "682321ccea6b7a31c4f7525704e1b47ce4ac6cd574ff17ca03d763e1136b659eb3fd17d95dbeef5d935f029504739fa726deb04affa9c91f3a9dcf9b33bbe072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-homedir \
perl-homedir"

RDEPENDS:${PN} += "/usr/bin/cpan \
perl-local-lib"

inherit rpm
