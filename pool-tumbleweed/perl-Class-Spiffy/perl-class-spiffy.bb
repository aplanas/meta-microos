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

RPM_NAME = "perl-Class-Spiffy-0.15-138.21.noarch.rpm"
RPM_HASH = "ece492597fc3e92f2216f78057177ed335f49e3baf123a26781d81a0da02f3bacb0b0a5f0f09b383a63d0c82ffc072ba37c5e0279e87d2904ddf2a573ae14e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Spiffy \
perl-Class--Spiffy--mixin \
perl-Class-Spiffy \
perl-DB"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
