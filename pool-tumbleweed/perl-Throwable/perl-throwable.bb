SUMMARY = "Role for classes that can be thrown"
DESCRIPTION = "Throwable is a role for classes that are meant to be thrown as exceptions \
to standard program flow. It is very simple and does only two things: saves \
any previous value for '$@' and calls 'die $self'. \
 \
Throwable is implemented with Moo, so you can stick to Moo or use Moose, as \
you prefer."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001"

RPM_NAME = "perl-Throwable-1.001-1.4.noarch.rpm"
RPM_HASH = "21fbff30313351415a2af71bc00cda713701dc65f271e1ebfd090f4806ee35b93416e43ce2a352edd0e4c9e2e67a8b589ea0b5ebc6f02043a27ee161feef2237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-StackTrace--Auto \
perl-Throwable \
perl-Throwable--Error"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--StackTrace \
perl-Module--Runtime \
perl-Moo \
perl-Moo--Role \
perl-Sub--Quote"

inherit rpm
