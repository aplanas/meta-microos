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

RPM_NAME = "perl-Class-C3-XS-0.15-1.17.aarch64.rpm"
RPM_HASH = "1d6f9132734886f89b566767e8838b8b81b096f176dad2e60f47c42e0c3a8eea4671be2f2d3e504bb762144b0544964eb217d0ac1d13777077fd1d07ffb2f51e"

RPROVIDES:${PN} += "perl(Class::C3::XS) \
perl-Class-C3-XS \
perl-Class-C3-XS(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
