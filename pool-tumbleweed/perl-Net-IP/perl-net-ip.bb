SUMMARY = "Perl extension for manipulating IPv4/IPv6 addresses"
DESCRIPTION = "This module provides functions to deal with *IPv4/IPv6* addresses. The \
module can be used as a class, allowing the user to instantiate IP objects, \
which can be single IP addresses, prefixes, or ranges of addresses. There \
is also a procedural way of accessing most of the functions. Most \
subroutines can take either *IPv4* or *IPv6* addresses transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-Net-IP-1.26-8.15.noarch.rpm"
RPM_HASH = "6369f5ff7732729e9d9c7a8ba545d3e113cb10779227e18e397d87038191dd55326378bcb7567a8bfa8a6adf8d9d3e5fc9dadf3d1e838c76bcb687b41bec6330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::IP) \
perl-Net-IP \
perl_Net-IP"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
