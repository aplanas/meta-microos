SUMMARY = "Programmable Dns Resolver Class for Offline"
DESCRIPTION = "*Net::DNS::Resolver::Programmable* is a *Net::DNS::Resolver* descendant \
class that allows a virtual DNS to be emulated instead of querying the real \
DNS. A set of static DNS records may be supplied, or arbitrary code may be \
specified as a means for retrieving DNS records, or even generating them on \
the fly."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-Net-DNS-Resolver-Programmable-0.009-1.23.noarch.rpm"
RPM_HASH = "6d00d78677805781a90c8e36824be7da103259b17a3303fbfa296b223ae6b48bc4489d641804ae0768d66c87a44865e3b66abfaa7ff70829601928616b289b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--DNS--Resolver--Programmable \
perl-Net-DNS-Resolver-Programmable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Net--DNS"

inherit rpm
