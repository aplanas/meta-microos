SUMMARY = "Mock a DNS Resolver object for testing"
DESCRIPTION = "A subclass of Net::DNS::Resolver which parses a zonefile for it's data \
source. Primarily for use in testing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.20230216"

RPM_NAME = "perl-Net-DNS-Resolver-Mock-1.20230216-1.1.noarch.rpm"
RPM_HASH = "8251b344aead018a453b575785e9d0198c45d7cb72357ae872dea8cea77d9a182e8451f7d109fe0548eabc7eedc50e498632875ce85f51c2e5db5392722b057e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Mock \
perl-Net-DNS-Resolver-Mock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Net--DNS--Packet \
perl-Net--DNS--Question \
perl-Net--DNS--Resolver \
perl-Net--DNS--ZoneFile"

inherit rpm
