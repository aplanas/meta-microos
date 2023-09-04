SUMMARY = "Project templates for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the project templates package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "7.0.6"

RPM_NAME = "kicad-templates-7.0.6-1.1.noarch.rpm"
RPM_HASH = "9ddedf84517486c606458df606c6a6c8f9f5538858ae8136b88684ef4dd208ca0394554d6b1d01311fe3a53eacba8ba1c105e37da5629f95343d799c6648d565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library-/usr/share/kicad/template/Arduino-Fio/fp-lib-table \
kicad-templates"

RDEPENDS:${PN} += ""

inherit rpm
