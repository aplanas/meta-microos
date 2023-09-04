SUMMARY = "Perl extension for the SANE (Scanner Access Now Easy)"
DESCRIPTION = "These Perl bindings for the SANE (Scanner Access Now Easy) Project allow \
you to access SANE-compatible scanners in a Perlish and object-oriented \
way, freeing you from the casting and memory management in C, yet remaining \
very close in spirit to original API. \
 \
Find out more about SANE at http://www.sane-project.org."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5"

RPM_NAME = "perl-Image-Sane-5-3.1.aarch64.rpm"
RPM_HASH = "2543957e387acf4e79c45fdc0c27643639fcb537e5a84278b637bb8101ea20d55fe4118f13a41164ae3882ef97aa0713f187b1558de005b7843ca7f53daa6ecf"

RPROVIDES:${PN} += "perl-Image--Sane \
perl-Image--Sane--Device \
perl-Image-Sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
perl--MODULE-COMPAT-5.38.0 \
perl-Exception--Class \
perl-Readonly"

inherit rpm
