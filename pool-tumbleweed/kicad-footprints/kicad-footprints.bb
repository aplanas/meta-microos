SUMMARY = "Footprint library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the footprints library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.6"

RPM_NAME = "kicad-footprints-7.0.6-1.1.noarch.rpm"
RPM_HASH = "741a518001a241ac591916e0671a24fe99283fa8dae2b83c7c796cda70a66f68a4c41912cf4a81c827d57661196b583e7c27e182f9d1cd4c820721a94f0e76ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-footprints \
kicad-library-/usr/share/kicad/template/fp-lib-table"

RDEPENDS:${PN} += ""

inherit rpm
