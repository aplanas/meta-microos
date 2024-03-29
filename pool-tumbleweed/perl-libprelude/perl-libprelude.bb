SUMMARY = "Perl bindings for libprelude"
DESCRIPTION = "Perl bindings for libprelude generated by SWIG."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "perl-libprelude-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "864ce64a15f6e65a895152a187f6d6cd85b95966bc19fa95d70b1326eb3d948f9393aeefd208df9eafadd189247b5ffe6f9a70406c0a354d5f7cab984fad2128"

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
