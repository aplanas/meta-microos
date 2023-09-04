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

RPM_NAME = "perl-Class-C3-Adopt-NEXT-0.14-1.26.noarch.rpm"
RPM_HASH = "6bcdfb50e026f8142abff2dc1d8a8cfcb16afe0ecad7024de5046777ee09655201021980cf7216ee61070bca4903e2cc7302d9665700f33712bb8eeedebad0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3--Adopt--NEXT \
perl-Class-C3-Adopt-NEXT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-List--Util \
perl-MRO--Compat"

inherit rpm
