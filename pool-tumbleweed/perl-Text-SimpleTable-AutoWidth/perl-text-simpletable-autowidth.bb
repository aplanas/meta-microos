SUMMARY = "Text::SimpleTable::AutoWidth - Simple eyecandy ASCII tables with auto-wi[cut]"
DESCRIPTION = "Simple eyecandy ASCII tables with auto-selection columns width, as seen in \
Catalyst."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Text-SimpleTable-AutoWidth-0.09-1.12.noarch.rpm"
RPM_HASH = "67578e870f6d4fb7177696735a814b1c911ff93d1fb3a116664a1653a2288fb177ae3243a272f674add13387fdef857de770d34ae2bec5fcf6161a422d00ee51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SimpleTable--AutoWidth \
perl-Text-SimpleTable-AutoWidth"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo \
perl-Text--SimpleTable"

inherit rpm
