SUMMARY = "IPv4 and IPv6 validation methods"
DESCRIPTION = "This module provides a number IP address validation subs that both validate \
and untaint their input. This includes both basic validation ('is_ipv4()' \
and 'is_ipv6()') and special cases like checking whether an address belongs \
to a specific network or whether an address is public or private \
(reserved)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.31"

RPM_NAME = "perl-Data-Validate-IP-0.31-1.4.noarch.rpm"
RPM_HASH = "7d8db4dfdfe5c464c9438bcd91410d6db5695c043a958e91aa238c0c853940b5adde9f6cf387a98e7169deb8f989b75f8f0b06a683475e32f3efa7903ae3d0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Validate--IP \
perl-Data-Validate-IP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-NetAddr--IP"

inherit rpm
