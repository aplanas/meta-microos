SUMMARY = "3D model libraries for rendering and MCAD integration"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This package contains 3D models associated with the various KiCad footprint \
library components for rendering and mechanical CAD (MCAD) integration."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.5"

RPM_NAME = "kicad-packages3D-7.0.5-1.1.noarch.rpm"
RPM_HASH = "3e63866652ae23f534a03da108ce4c0c1fddc495d92f5581f713213775475e44eac34fb89eb926f3e8e46a16a6b3c63206e90d709528b1f41b0601c81c6d4a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library-3d \
kicad-packages3D"

RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
