SUMMARY = "Text::SimpleTable::AutoWidth - Simple eyecandy ASCII tables with auto-wi[cut]"
DESCRIPTION = "Simple eyecandy ASCII tables with auto-selection columns width, as seen in \
Catalyst."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Text-SimpleTable-AutoWidth-0.09-1.11.noarch.rpm"
RPM_HASH = "b4941dc3e8f9c3b2eb1bc03372a0eb165f78c47f29da00db0da2cfdf2125d2f76812373cd7d0df4221079ce8b4a761144b7d82f4faac1ce99b0a16916271c614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SimpleTable--AutoWidth \
perl-Text-SimpleTable-AutoWidth"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moo \
perl-Text--SimpleTable"

inherit rpm
