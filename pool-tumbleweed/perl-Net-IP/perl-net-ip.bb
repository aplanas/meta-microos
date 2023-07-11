SUMMARY = "Perl extension for manipulating IPv4/IPv6 addresses"
DESCRIPTION = "This module provides functions to deal with *IPv4/IPv6* addresses. The \
module can be used as a class, allowing the user to instantiate IP objects, \
which can be single IP addresses, prefixes, or ranges of addresses. There \
is also a procedural way of accessing most of the functions. Most \
subroutines can take either *IPv4* or *IPv6* addresses transparently."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.26"

RPM_NAME = "perl-Net-IP-1.26-8.16.noarch.rpm"
RPM_HASH = "496fc90a1afafbf77f6b13d45f23aeef12189fc08d022f9c7e74954cbfa08c2a73a60c1cda06b28d908ad3e7556fac0899c1e7ca147618a90d0f701524cd4bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--IP \
perl-Net-IP"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
