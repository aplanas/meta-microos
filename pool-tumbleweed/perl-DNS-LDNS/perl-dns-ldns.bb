SUMMARY = "Perl bindings for ldns"
DESCRIPTION = "Perl bindings for the ldns library."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "perl-DNS-LDNS-1.8.3-1.7.aarch64.rpm"
RPM_HASH = "04aefa0ff9380ea21dc9cbbe86b4e8289e023c0e6ec4b5eba78a0f72ef9cba5258af8544e0f0672173974a0dad703e8c93e60bcae61c03ebcbb2e1da17948852"

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
