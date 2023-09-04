SUMMARY = "Choose appropriate clone utility"
DESCRIPTION = "'Clone::Choose' checks several different modules which provides a 'clone()' \
function and selects an appropriate one. The default preference is \
 \
  Clone \
  Storable \
  Clone::PP \
 \
This list might evolve in future. Please see EXPORTS how to pick a \
particular one."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010"

RPM_NAME = "perl-Clone-Choose-0.010-1.19.noarch.rpm"
RPM_HASH = "cf7028fc322808837c3d387a873f56d14bf10bbb1f19c6ed287f228cda30735a06406a6b5d48b5530cfb2220a2ec3333b920464781e0b2c5d2a01292bf302e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Clone--Choose \
perl-Clone-Choose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
