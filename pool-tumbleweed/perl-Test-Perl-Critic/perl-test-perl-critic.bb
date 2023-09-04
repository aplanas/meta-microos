SUMMARY = "Use Perl::Critic in test programs"
DESCRIPTION = "Test::Perl::Critic wraps the Perl::Critic engine in a convenient subroutine \
suitable for test programs written using the Test::More framework. This \
makes it easy to integrate coding-standards enforcement into the build \
process. For ultimate convenience (at the expense of some flexibility), see \
the criticism pragma. \
 \
If you have an large existing code base, you might prefer to use \
Test::Perl::Critic::Progressive, which allows you to clean your code \
incrementally instead of all at once.. \
 \
If you'd like to try Perl::Critic without installing anything, there is a \
web-service available at http://perlcritic.com. The web-service does not \
support all the configuration features that are available in the native \
Perl::Critic API, but it should give you a good idea of what Perl::Critic \
can do."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.04"

RPM_NAME = "perl-Test-Perl-Critic-1.04-1.17.noarch.rpm"
RPM_HASH = "acff3d5ba44b54c5da46725696e772126d2a18f5a2156054b59a0e003e50e22421c4642d66af7be22db7b15488a8365aa1d4470c0fc3a7678f03e47f2431210c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Perl--Critic \
perl-Test-Perl-Critic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MCE \
perl-Perl--Critic \
perl-Perl--Critic--Utils \
perl-Perl--Critic--Violation \
perl-Test--Builder"

inherit rpm
