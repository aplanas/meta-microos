SUMMARY = "Freetype2 Utilities and Demo Programs"
DESCRIPTION = "Freetype2 utilities and demo programs."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ft2demos-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "19eeb9adb592c61ee31465456b15aca0679179e2decef4cfe125e1b3968673364ad8360b370036561ae5b6be55e2ab9b894b6f606050625a71f8ab0007be062a"

RPROVIDES:${PN} += "ft2demos ft2demos(aarch-64)"
RDEPENDS:${PN} += "ftbench ftdiff ftdump ftgamma ftgrid ftinspect ftlint ftmulti ftstring ftvalid ftview"

inherit rpm
