SUMMARY = "Perl bindings for ldns"
DESCRIPTION = "Perl bindings for the ldns library."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "perl-DNS-LDNS-1.8.3-1.4.aarch64.rpm"
RPM_HASH = "6951f52ca2fc42f11f74f27fc1e2d1def2388a4c6ccdb0ecafae96cb470616a0831f7d307e6aedf695dfdc7d59ad74f08149cfc85d636f6b56cf8ef864850950"

RPROVIDES:${PN} += "perl(DNS::LDNS) \
perl(DNS::LDNS::DNSSecDataChain) \
perl(DNS::LDNS::DNSSecName) \
perl(DNS::LDNS::DNSSecRRSets) \
perl(DNS::LDNS::DNSSecRRs) \
perl(DNS::LDNS::DNSSecTrustTree) \
perl(DNS::LDNS::DNSSecZone) \
perl(DNS::LDNS::GC) \
perl(DNS::LDNS::Key) \
perl(DNS::LDNS::KeyList) \
perl(DNS::LDNS::Packet) \
perl(DNS::LDNS::RBNode) \
perl(DNS::LDNS::RBTree) \
perl(DNS::LDNS::RData) \
perl(DNS::LDNS::RR) \
perl(DNS::LDNS::RRList) \
perl(DNS::LDNS::Resolver) \
perl(DNS::LDNS::Zone) \
perl-DNS-LDNS \
perl-DNS-LDNS(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libldns3 \
perl"

inherit rpm
