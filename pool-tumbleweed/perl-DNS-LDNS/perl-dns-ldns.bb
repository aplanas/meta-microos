SUMMARY = "Perl bindings for ldns"
DESCRIPTION = "Perl bindings for the ldns library."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "perl-DNS-LDNS-1.8.3-1.8.aarch64.rpm"
RPM_HASH = "8c0392d0f0a3df0818eebafb5d0cce222b8c7f273e5fe30b49e3c07e3eecb9789d46ad4f54be03d859556ee8568fead160e1516e47760cd4bce0c48a4b3b61bb"

RPROVIDES:${PN} += "perl-DNS--LDNS \
perl-DNS--LDNS--DNSSecDataChain \
perl-DNS--LDNS--DNSSecName \
perl-DNS--LDNS--DNSSecRRSets \
perl-DNS--LDNS--DNSSecRRs \
perl-DNS--LDNS--DNSSecTrustTree \
perl-DNS--LDNS--DNSSecZone \
perl-DNS--LDNS--GC \
perl-DNS--LDNS--Key \
perl-DNS--LDNS--KeyList \
perl-DNS--LDNS--Packet \
perl-DNS--LDNS--RBNode \
perl-DNS--LDNS--RBTree \
perl-DNS--LDNS--RData \
perl-DNS--LDNS--RR \
perl-DNS--LDNS--RRList \
perl-DNS--LDNS--Resolver \
perl-DNS--LDNS--Zone \
perl-DNS-LDNS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldns3 \
perl"

inherit rpm
