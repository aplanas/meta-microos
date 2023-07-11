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

RPM_NAME = "perl-Clone-Choose-0.010-1.18.noarch.rpm"
RPM_HASH = "c2ad31628dac012a04719811ae33894a512760f7dc31d9062e70965c002461c4b5e761217a5d34d17ae8819e89373741b919b6d0cfcefe170b4374114f2a660a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Clone--Choose \
perl-Clone-Choose"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
