SUMMARY = "Programmable Dns Resolver Class for Offline"
DESCRIPTION = "*Net::DNS::Resolver::Programmable* is a *Net::DNS::Resolver* descendant \
class that allows a virtual DNS to be emulated instead of querying the real \
DNS. A set of static DNS records may be supplied, or arbitrary code may be \
specified as a means for retrieving DNS records, or even generating them on \
the fly."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Net-DNS-Resolver-Programmable-0.009-1.22.noarch.rpm"
RPM_HASH = "b1d882fe374473222aa8de2433d5b6f052a7a3dc6249e0027e9012b826f32ca782aa5e01263e6c3f241d149dd3157e3b36a06b1d55932a115516311f650fa393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Programmable \
perl-Net-DNS-Resolver-Programmable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Net--DNS"

inherit rpm
