SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-0.6.0-44.24.aarch64.rpm"
RPM_HASH = "d3149a61aa31c388deaf30040be41c6d2ce5667317e3827d7bb59c13773702e6a1a6dc3f397ab55e02cd1c48471ca697082593df0b95531ecd10a255086b21df"

RPROVIDES:${PN} += "tomoe-gtk"

RDEPENDS:${PN} += "libtomoe-gtk0 \
tomoe-gtk-lang"

inherit rpm
