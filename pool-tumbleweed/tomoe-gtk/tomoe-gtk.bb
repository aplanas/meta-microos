SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-0.6.0-44.25.aarch64.rpm"
RPM_HASH = "c2a8f36f68f393a2132eb1d70159151bc2269a78c3e9f110c8c9449fff6ccb8ecfcd6e2a984f88438acc664245506ca820a15ed5f3bc279b2691dcaaa50c59b0"

RPROVIDES:${PN} += "tomoe-gtk"

RDEPENDS:${PN} += "libtomoe-gtk0 \
tomoe-gtk-lang"

inherit rpm
