SUMMARY = "LUKS integration for Clevis"
DESCRIPTION = "LUKS integration for Clevis."
LICENSE = "GPL-3.0-or-later"

PV = "19"

RPM_NAME = "clevis-luks-19-1.1.aarch64.rpm"
RPM_HASH = "692b45b9c120f18d9785381e57c354ba16219f627484f9ca81ef98daa6c43cd81e281cb460300b17151d00fdf1bddb80ba1cb23ce96358b9992c6f2419d1f403"

RPROVIDES:${PN} += "clevis-luks clevis-luks(aarch-64)"
RDEPENDS:${PN} += "/bin/bash clevis cryptsetup libpwquality-tools"

inherit rpm
