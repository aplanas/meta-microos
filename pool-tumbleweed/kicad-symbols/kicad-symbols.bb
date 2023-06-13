SUMMARY = "Schematic symbol library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the schematic symbol library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.5"

RPM_NAME = "kicad-symbols-7.0.5-1.1.noarch.rpm"
RPM_HASH = "3f75f6bcd0183d6fce941254081d7bb9e1b4deb68d7e0fabca02cb6169ab5d31fb3d960ea1c23bbfa3a9ced4883480435401f44a854e3473d0ef5ce891090471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library \
kicad-symbols"

RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
