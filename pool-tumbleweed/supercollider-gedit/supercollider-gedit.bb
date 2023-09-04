SUMMARY = "SuperCollider support for GEdit"
DESCRIPTION = "SuperCollider support for the GEdit text editor."
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-gedit-3.13.0-1.4.aarch64.rpm"
RPM_HASH = "728333e7167336473c27f5c9dfa50b08ec255c1bc8fef10340d2e20c1086e1ffd46639142390001ef69c559ec606d2fa9a58ab57a1b9bfdeecff7244e0502ef6"

RPROVIDES:${PN} += "supercollider-gedit"

RDEPENDS:${PN} += "supercollider"

inherit rpm
