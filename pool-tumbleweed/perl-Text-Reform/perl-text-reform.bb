SUMMARY = "Manual text wrapping and reformatting"
DESCRIPTION = "The module supplies a re-entrant, highly configurable replacement \
for the built-in Perl format() mechanism. \
 \
Author: \
------- \
        Damian Conway <damian@conway.org>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.20"

RPM_NAME = "perl-Text-Reform-1.20-24.26.noarch.rpm"
RPM_HASH = "bfceb344a9df69dc264991cf2a024fc1dce544843246c0d92bb3362880e1b610cca72668aba5ca6b63fa0fcdfc3d123b52c3d4e1bf63de9a0b7ac0c20d45cff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Reform \
perl-Text-Reform"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exporter"

inherit rpm
