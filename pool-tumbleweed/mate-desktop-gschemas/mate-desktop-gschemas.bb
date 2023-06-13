SUMMARY = "MATE Desktop GSchemas"
DESCRIPTION = "This package provides the GSettings schemas for \
MATE Desktop Environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-gschemas-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "938734c64559fc92fc4eae155f43351ba2d64a57416774bad860f1de6d912dbc5855a1b60335262f9107ddc2b3baec55f17ecf114a1f70b5bdf8b32658126883"

RPROVIDES:${PN} += "mate-desktop-gschemas \
mate-desktop-gschemas(aarch-64) \
mate-desktop-gsettings-schemas"

RDEPENDS:${PN} += "mate-desktop-gschemas-branding"

inherit rpm
