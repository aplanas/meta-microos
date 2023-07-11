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

RPM_NAME = "perl-Class-C3-XS-0.15-1.18.aarch64.rpm"
RPM_HASH = "3559f262f74d60343c4d16090ed0d2cae5102b189d569e421646e2796d14de0745cc8dd2aa07a2f88f4b1fd38ac6ddbf831bf38e4552448acdaddffdf3f07107"

RPROVIDES:${PN} += "perl-Class--C3--XS \
perl-Class-C3-XS"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
