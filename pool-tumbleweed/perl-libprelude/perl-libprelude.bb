SUMMARY = "Perl bindings for libprelude"
DESCRIPTION = "Perl bindings for libprelude generated by SWIG."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "perl-libprelude-5.2.0-2.16.aarch64.rpm"
RPM_HASH = "6656508444d5f01fafacc2ac42ef971df1342c69d79557970eafda503becd53f48b4a66d4e14fe99010824c9b63520c7eb09575fa13c12b339c41dd727bf43c0"

RPROVIDES:${PN} += "perl-Prelude \
perl-Prelude--Client \
perl-Prelude--ClientEasy \
perl-Prelude--ClientProfile \
perl-Prelude--Connection \
perl-Prelude--ConnectionPool \
perl-Prelude--IDMEF \
perl-Prelude--IDMEFClass \
perl-Prelude--IDMEFCriteria \
perl-Prelude--IDMEFCriterion \
perl-Prelude--IDMEFPath \
perl-Prelude--IDMEFTime \
perl-Prelude--IDMEFValue \
perl-Prelude--PreludeError \
perl-Prelude--PreludeLog \
perl-Preludec \
perl-libprelude"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprelude.so.28 \
libprelude28 \
libpreludecpp.so.12 \
perl"

inherit rpm
