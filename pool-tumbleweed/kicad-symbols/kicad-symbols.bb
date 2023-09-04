SUMMARY = "Schematic symbol library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the schematic symbol library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.6"

RPM_NAME = "kicad-symbols-7.0.6-1.1.noarch.rpm"
RPM_HASH = "c99311fc698d01b436500bd459f8e0a31077b2263d832a497dbdd8170d4e649cbbb57ad6144686f307142e6f7d606ad4cb7672a87ab1836dfc99033dde09dda1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library \
kicad-symbols"

RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
