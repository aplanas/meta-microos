SUMMARY = "Text::SimpleTable::AutoWidth - Simple eyecandy ASCII tables with auto-wi[cut]"
DESCRIPTION = "Simple eyecandy ASCII tables with auto-selection columns width, as seen in \
Catalyst."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Text-SimpleTable-AutoWidth-0.09-1.10.noarch.rpm"
RPM_HASH = "a8d3da847ee1d7ee77faaf3a23a6a4baa75a87f69bb26bb9e989e3d6d1c336a82ace4b86129cc8866ed065150893fb54e3a3859af2993844233d0fe5f75f1de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::SimpleTable::AutoWidth) \
perl-Text-SimpleTable-AutoWidth"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moo) \
perl(Text::SimpleTable)"

inherit rpm
