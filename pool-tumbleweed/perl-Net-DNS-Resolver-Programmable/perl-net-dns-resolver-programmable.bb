SUMMARY = "Programmable Dns Resolver Class for Offline"
DESCRIPTION = "*Net::DNS::Resolver::Programmable* is a *Net::DNS::Resolver* descendant \
class that allows a virtual DNS to be emulated instead of querying the real \
DNS. A set of static DNS records may be supplied, or arbitrary code may be \
specified as a means for retrieving DNS records, or even generating them on \
the fly."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Net-DNS-Resolver-Programmable-0.009-1.21.noarch.rpm"
RPM_HASH = "c390304be463e25a19ff28433058902a84ee5754249ba5018cfd93e9d83ce953057a733b240d674d20fa8d8c674be7fcc504a9d4d64748633a231ac5f789c0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Programmable \
perl-Net-DNS-Resolver-Programmable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Net--DNS"

inherit rpm
