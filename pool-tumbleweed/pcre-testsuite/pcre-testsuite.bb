SUMMARY = "Tests for libpcre"
DESCRIPTION = "This package contains the testsuite part of the PCRE library."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-testsuite-8.45-2.6.aarch64.rpm"
RPM_HASH = "1176033d439da3e549d2feea91bf70444e3eaaf12ad807296fd82e3390e4ce04a57526f594fd82c6e1ac0f01be9a4a7b2441fa00fd871241b95cbfe12916d2fc"

RPROVIDES:${PN} += "pcre-testsuite \
pcre-testsuite(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpcre.so.1()(64bit) \
libpcre16.so.0()(64bit) \
libpcrecpp.so.0()(64bit) \
libpcreposix.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
