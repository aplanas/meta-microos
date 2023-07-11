SUMMARY = "Manual text wrapping and reformatting"
DESCRIPTION = "The module supplies a re-entrant, highly configurable replacement \
for the built-in Perl format() mechanism. \
 \
Author: \
------- \
        Damian Conway <damian@conway.org>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.20"

RPM_NAME = "perl-Text-Reform-1.20-24.25.noarch.rpm"
RPM_HASH = "5f60967d97ef4b807c0598431869cdaba0849d3280c0d4e9bc1d3f9e16a4d178a6cb74741e629561633b838a09e6a918a2cc22ea312ebe007b7ddf35485a919b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Reform \
perl-Text-Reform"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exporter"

inherit rpm
