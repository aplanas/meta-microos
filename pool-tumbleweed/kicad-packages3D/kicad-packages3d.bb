SUMMARY = "3D model libraries for rendering and MCAD integration"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This package contains 3D models associated with the various KiCad footprint \
library components for rendering and mechanical CAD (MCAD) integration."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.6"

RPM_NAME = "kicad-packages3D-7.0.6-1.1.noarch.rpm"
RPM_HASH = "0f66fd390c2462c9082a5beab8a59d409cd305e004af13cae35374fe94d7a5ebab45ef94cbb393c07732b168c5f35c44756f0d6f2a16544e7f6e5626fd1377d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library-3d \
kicad-packages3D"

RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
