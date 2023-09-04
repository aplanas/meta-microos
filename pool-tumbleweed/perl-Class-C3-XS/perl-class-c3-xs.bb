SUMMARY = "XS speedups for Class::C3"
DESCRIPTION = "This contains XS performance enhancers for Class::C3 version 0.16 and \
higher. The main Class::C3 package will use this package automatically if \
it can find it. Do not use this package directly, use Class::C3 instead. \
 \
The test suite here is not complete, although it does verify a few basic \
things. The best testing comes from running the Class::C3 test suite \
*after* this module is installed. \
 \
This module won't do anything for you if you're running a version of \
Class::C3 older than 0.16. (It's not a dependency because it would be \
circular with the optional dependency from that package to this one)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Class-C3-XS-0.15-1.19.aarch64.rpm"
RPM_HASH = "2dd43960feb1c45b6d04ed74ac3d259e3b6a4ba688b735f143130a321b50b73f53a8b135521260cf959fdad1d424898c38ad29303dbecbdd3211217ca7e821f9"

RPROVIDES:${PN} += "perl-Class--C3--XS \
perl-Class-C3-XS"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
