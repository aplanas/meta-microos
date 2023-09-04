SUMMARY = "Mock a DNS Resolver object for testing"
DESCRIPTION = "A subclass of Net::DNS::Resolver which parses a zonefile for it's data \
source. Primarily for use in testing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230216"

RPM_NAME = "perl-Net-DNS-Resolver-Mock-1.20230216-1.3.noarch.rpm"
RPM_HASH = "9b66a7ebb88039ecb131ef2380a65189547f7e63336d0c75e0a72ab822e98dc3a452a425cc201d66450218f0c23b903278421e558915e622c4f848cc8531f63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Mock \
perl-Net-DNS-Resolver-Mock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Net--DNS--Packet \
perl-Net--DNS--Question \
perl-Net--DNS--Resolver \
perl-Net--DNS--ZoneFile"

inherit rpm
