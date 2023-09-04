SUMMARY = "Perl extension for manipulating IPv4/IPv6 addresses"
DESCRIPTION = "This module provides functions to deal with *IPv4/IPv6* addresses. The \
module can be used as a class, allowing the user to instantiate IP objects, \
which can be single IP addresses, prefixes, or ranges of addresses. There \
is also a procedural way of accessing most of the functions. Most \
subroutines can take either *IPv4* or *IPv6* addresses transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-Net-IP-1.26-8.17.noarch.rpm"
RPM_HASH = "12aba0e98bd746e87381c3c2886ab09dcb79eba4b9b2735540e0c39112c5a407116a9f914bd53b3ba8603170acb4a4ec64074972952d28e7eeb743a5b78a2074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--IP \
perl-Net-IP"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
