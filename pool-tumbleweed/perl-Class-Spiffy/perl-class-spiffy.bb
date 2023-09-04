SUMMARY = "Spiffy Framework with No Source Filtering"
DESCRIPTION = "'Class::Spiffy' is a framework and methodology for doing object oriented \
(OO) programming in Perl. Class::Spiffy combines the best parts of \
Exporter.pm, base.pm, mixin.pm and SUPER.pm into one magic foundation \
class. It attempts to fix all the nits and warts of traditional Perl OO, in \
a clean, straightforward and (perhaps someday) standard way. \
 \
Class::Spiffy borrows ideas from other OO languages like Python, Ruby, Java \
and Perl 6. It also adds a few tricks of its own. \
 \
If you take a look on CPAN, there are a ton of OO related modules. When \
starting a new project, you need to pick the set of modules that makes most \
sense, and then you need to use those modules in each of your classes. \
Class::Spiffy, on the other hand, has everything you'll probably need in \
one module, and you only need to use it once in one of your classes. If you \
make Class::Spiffy the base class of the basest class in your project, \
Class::Spiffy will automatically pass all of its magic to all of your \
subclasses. You may eventually forget that you're even using it!"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Class-Spiffy-0.15-138.22.noarch.rpm"
RPM_HASH = "caf2f5e75ab89b2340cdf3e51d6f136316dbc6fc168c71ecd0f1796c0923628af2581aca25f5d267612f2939c914a43800060577572dd6398aec5b641abb7465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Spiffy \
perl-Class--Spiffy--mixin \
perl-Class-Spiffy \
perl-DB"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
