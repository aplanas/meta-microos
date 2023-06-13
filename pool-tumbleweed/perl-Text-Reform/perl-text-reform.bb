SUMMARY = "Manual text wrapping and reformatting"
DESCRIPTION = "The module supplies a re-entrant, highly configurable replacement \
for the built-in Perl format() mechanism. \
 \
Author: \
------- \
        Damian Conway <damian@conway.org>"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.20"

RPM_NAME = "perl-Text-Reform-1.20-24.24.noarch.rpm"
RPM_HASH = "21719e207d50c6452f7528ed890e3c39fbd2317e71cb4bbcf988a41c9b0a93aa89c8ada2760f93b3b759939b3e7b37bbc1d76ba5f3f3d38beac761fa9bfa02c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Reform) \
perl-Text-Reform"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Exporter)"

inherit rpm
