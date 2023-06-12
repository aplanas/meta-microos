SUMMARY = "GNOME Integrated Development Environment"
DESCRIPTION = "Development under GNOME"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_ide-20201210-16.1.aarch64.rpm"
RPM_HASH = "1d1cce1218f92f0ea8ca293165514db727898a288987b0539e40c7822aeadb8a1354f586044ae9565e025d6b2cb18d7960de1919b2da964f806ded1a04006b77"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_ide \
patterns-gnome-gnome_ide(aarch-64) \
patterns-openSUSE-gnome_ide"
RDEPENDS:${PN} += ""

inherit rpm
