SUMMARY = "Make Next Suck Less"
DESCRIPTION = "the NEXT manpage was a good solution a few years ago, but isn't any more. \
It's slow, and the order in which it re-dispatches methods appears random \
at times. It also encourages bad programming practices, as you end up with \
code to re-dispatch methods when all you really wanted to do was run some \
code before or after a method fired. \
 \
However, if you have a large application, then weaning yourself off 'NEXT' \
isn't easy. \
 \
This module is intended as a drop-in replacement for NEXT, supporting the \
same interface, but using the Class::C3 manpage to do the hard work. You \
can then write new code without 'NEXT', and migrate individual source files \
to use 'Class::C3' or method modifiers as appropriate, at whatever pace \
you're comfortable with."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Class-C3-Adopt-NEXT-0.14-1.24.noarch.rpm"
RPM_HASH = "d11f72a0900cae5108b0a0e61200f6e3b2aae1320d9b6e25d34c488c4d6b473cd0dcf37108e1160291728096f812e100dd48b9b9bc2a3660f5e3c2118fc492aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Class::C3::Adopt::NEXT) \
perl-Class-C3-Adopt-NEXT"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(List::Util) \
perl(MRO::Compat)"

inherit rpm
