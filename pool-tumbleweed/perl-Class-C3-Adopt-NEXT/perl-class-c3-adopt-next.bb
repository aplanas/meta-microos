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

RPM_NAME = "perl-Class-C3-Adopt-NEXT-0.14-1.25.noarch.rpm"
RPM_HASH = "9f45ec4d3fcc4399f77dc97ce93c6ff26eb786c88b0a5792e017db0d601c4b0a43952b5f2dc4ce9bb1c1e77e62f05826dd97403bd35e3dc93425b9e7d3f3405f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3--Adopt--NEXT \
perl-Class-C3-Adopt-NEXT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-List--Util \
perl-MRO--Compat"

inherit rpm
