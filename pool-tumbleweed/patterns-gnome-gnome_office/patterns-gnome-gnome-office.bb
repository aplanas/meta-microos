SUMMARY = "GNOME Office"
DESCRIPTION = "GNOME Office"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_office-20201210-16.1.aarch64.rpm"
RPM_HASH = "ad99026da4ddd0121fbcc2e123fbc5b18939fcf2a7d830a5def611f7d434561afc84afd5e29d3a372c5ed848b46430b75040f14a325b20351ebdcd242ac58d08"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_office \
patterns-gnome-gnome_office(aarch-64) \
patterns-openSUSE-gnome_office"

RDEPENDS:${PN} += "pattern()"

inherit rpm
