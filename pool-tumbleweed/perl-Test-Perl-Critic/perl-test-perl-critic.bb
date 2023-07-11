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

RPM_NAME = "perl-Test-Perl-Critic-1.04-1.16.noarch.rpm"
RPM_HASH = "eb138557405dc942a82915e3ae012ea75c5b1c76edd89e3f688d35ae05e8810662de995f98fdf842862df3e18e634a0b279382b1552583d3fbbf8069e0873970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Perl--Critic \
perl-Test-Perl-Critic"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MCE \
perl-Perl--Critic \
perl-Perl--Critic--Utils \
perl-Perl--Critic--Violation \
perl-Test--Builder"

inherit rpm
