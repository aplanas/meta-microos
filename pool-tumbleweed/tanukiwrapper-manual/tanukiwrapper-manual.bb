SUMMARY = "Manuals for tanukiwrapper"
DESCRIPTION = "This package contains the manuals for tanukiwrapper"
LICENSE = "GPL-2.0-only"

PV = "3.5.35"

RPM_NAME = "tanukiwrapper-manual-3.5.35-2.6.aarch64.rpm"
RPM_HASH = "3625689c0f184e1be6acdd2dc323a1f3255541ac4652f43370b3d257785cd890adaffda19c3a6864321ae0aa0ae15ff232088a302bb41e2d24180ac4fca60075"

RPROVIDES:${PN} += "tanukiwrapper-manual"

RDEPENDS:${PN} += ""

inherit rpm
