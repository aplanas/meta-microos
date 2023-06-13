SUMMARY = "Project templates for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the project templates package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.5"

RPM_NAME = "kicad-templates-7.0.5-1.1.noarch.rpm"
RPM_HASH = "08501fd86731bd3fcf66a9258497a671e8396fbdb692e2529c0d9c5379c64f1ca4d5b8131521b3969fcc8ac5faf499982f818da2fa6cbd5ecaac43e3a37d0eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library:/usr/share/kicad/template/Arduino_Fio/fp-lib-table \
kicad-templates"

RDEPENDS:${PN} += ""

inherit rpm
