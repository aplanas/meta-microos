SUMMARY = "Role for classes that can be thrown"
DESCRIPTION = "Throwable is a role for classes that are meant to be thrown as exceptions \
to standard program flow. It is very simple and does only two things: saves \
any previous value for '$@' and calls 'die $self'. \
 \
Throwable is implemented with Moo, so you can stick to Moo or use Moose, as \
you prefer."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001"

RPM_NAME = "perl-Throwable-1.001-1.2.noarch.rpm"
RPM_HASH = "b19ca05d220550d66b9169992c17d285e1ca08060d59ed0925165e534db2e5bf1e154a431dcc732f069094c750f7d8c623bc3e6b70cb350353feb5bc116c43a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-StackTrace--Auto \
perl-Throwable \
perl-Throwable--Error"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Devel--StackTrace \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Sub--Quote"

inherit rpm
