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

RPM_NAME = "perl-homedir-2.000024-2.10.noarch.rpm"
RPM_HASH = "78b55120cc7d32550d27673c1a1f6f9a602b56ab7b02a577992d1851da1ef5fd7e2fddde1dbe7587d7bdd58f052e301572ab751314be38af7c866fd75cfb6d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-homedir \
perl-homedir"

RDEPENDS:${PN} += "/usr/bin/cpan \
perl-local-lib"

inherit rpm
