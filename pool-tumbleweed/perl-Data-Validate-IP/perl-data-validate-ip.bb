SUMMARY = "IPv4 and IPv6 validation methods"
DESCRIPTION = "This module provides a number IP address validation subs that both validate \
and untaint their input. This includes both basic validation ('is_ipv4()' \
and 'is_ipv6()') and special cases like checking whether an address belongs \
to a specific network or whether an address is public or private \
(reserved)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.31"

RPM_NAME = "perl-Data-Validate-IP-0.31-1.3.noarch.rpm"
RPM_HASH = "37a939a7e66cf73004b2fe45a9694a9a8cb6d8e78d5100d837eeb2caca54a9b43c9ad30c75ffdc5505c6152484b263b3266f2863b15fe8ddc030d1e4d991f9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Validate--IP \
perl-Data-Validate-IP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-NetAddr--IP"

inherit rpm
