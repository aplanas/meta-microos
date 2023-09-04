SUMMARY = "Per-user Perl local::lib setup"
DESCRIPTION = "perl-homedir configures the system to automatically create a ~/perl5 \
directory in each user's $HOME on user login.  This allows each user to \
install and CPAN packages via the CPAN to their $HOME, with no additional \
configuration or privliges, and without installing them system-wide. \
 \
If you want your users to be able to install and use their own Perl modules, \
install this package."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.000029"

RPM_NAME = "perl-homedir-2.000029-1.1.noarch.rpm"
RPM_HASH = "37bd0ef0895158c79e2318e1d624b70c53415765883d099aba2cf974d551a9954f761bd4892a318454cfabe3787a6a80804f73668bc057c9f8ff6460558486c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-perl-homedir \
perl-homedir"

RDEPENDS:${PN} += "/usr/bin/cpan \
perl-local-lib"

inherit rpm
