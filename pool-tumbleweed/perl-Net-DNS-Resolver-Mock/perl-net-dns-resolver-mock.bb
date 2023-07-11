SUMMARY = "Mock a DNS Resolver object for testing"
DESCRIPTION = "A subclass of Net::DNS::Resolver which parses a zonefile for it's data \
source. Primarily for use in testing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230216"

RPM_NAME = "perl-Net-DNS-Resolver-Mock-1.20230216-1.2.noarch.rpm"
RPM_HASH = "a203321a90feff00d324ce86dc90767f651790b69690c715ee6034636f1f11d8567004d010878f4f1acba9cd71ef5b1a76ece5d401074b41b41d066037afc727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Mock \
perl-Net-DNS-Resolver-Mock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Net--DNS--Packet \
perl-Net--DNS--Question \
perl-Net--DNS--Resolver \
perl-Net--DNS--ZoneFile"

inherit rpm
