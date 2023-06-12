SUMMARY = "Translations for package nm-tray"
DESCRIPTION = "Provides translations for the 'nm-tray' package."
LICENSE = "GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "nm-tray-lang-0.5.0-1.7.noarch.rpm"
RPM_HASH = "a49094fd883085859f62555cab0611d4b9544348931e6f2d5b95e3970da1556f91481eef938340039a4ae37b0f4c0ba8ca65646a0bc2fffbeb176407488efc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nm-tray-lang \
nm-tray-lang-all"
RDEPENDS:${PN} += "nm-tray"

inherit rpm
