SUMMARY = "Role for classes that can be thrown"
DESCRIPTION = "Throwable is a role for classes that are meant to be thrown as exceptions \
to standard program flow. It is very simple and does only two things: saves \
any previous value for '$@' and calls 'die $self'. \
 \
Throwable is implemented with Moo, so you can stick to Moo or use Moose, as \
you prefer."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001"

RPM_NAME = "perl-Throwable-1.001-1.3.noarch.rpm"
RPM_HASH = "642ffef1ddf526c9af72083b8808c643743c07d7d11f56bca2d93f8e7c0766fca474337853a3ef6cc8f4a17c5a9313ea369a53e04a9e1598a4cb6e513b0ac25a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-StackTrace--Auto \
perl-Throwable \
perl-Throwable--Error"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Devel--StackTrace \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Sub--Quote"

inherit rpm
