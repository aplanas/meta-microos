SUMMARY = "Color schemes for QGnomePlatform"
DESCRIPTION = "QGnomePlatform is a Qt Platform Theme designed to use as many of the GNOME \
settings as possible in unmodified Qt applications. It allows Qt applications \
to fit into the environment as well as possible."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & LGPL-2.1-or-later"

PV = "0.9.1"

RPM_NAME = "QGnomePlatform-colorschemes-0.9.1-1.1.noarch.rpm"
RPM_HASH = "ac2831333123b68576c434035883de1ad139d5f2641bc4839a59be6e41df11b8583db4b7f04f3a7c7eb53bba531117d64ea36835a5f8cc62b39ddd2def5ffd8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "QGnomePlatform-colorschemes"
RDEPENDS:${PN} += ""

inherit rpm
