SUMMARY = "Perl extension for the SANE (Scanner Access Now Easy)"
DESCRIPTION = "These Perl bindings for the SANE (Scanner Access Now Easy) Project allow \
you to access SANE-compatible scanners in a Perlish and object-oriented \
way, freeing you from the casting and memory management in C, yet remaining \
very close in spirit to original API. \
 \
Find out more about SANE at http://www.sane-project.org."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5"

RPM_NAME = "perl-Image-Sane-5-2.19.aarch64.rpm"
RPM_HASH = "4817fe14121f7442b0ced72cbda879c9f8fcab1e96cb61bcd9016dfef7d1c67f00ea36cb519bb31fa5f71ecb3b32948b9d1617ae10fb11d4c590da55cf160c9d"

RPROVIDES:${PN} += "perl-Image--Sane \
perl-Image--Sane--Device \
perl-Image-Sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
perl--MODULE-COMPAT-5.36.1 \
perl-Exception--Class \
perl-Readonly"

inherit rpm
