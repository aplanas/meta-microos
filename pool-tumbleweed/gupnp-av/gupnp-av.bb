SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "gupnp-av-0.14.1-3.1.aarch64.rpm"
RPM_HASH = "f19fcad70b23b0f2af4e0c66b8b22aec26f5826400a73b96eb1eefd8838c83562df205a3d65e5187ee8da25bdf7831641761d23d3444f64bb3bf49f3bb362151"

RPROVIDES:${PN} += "gupnp-av \
gupnp-av(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
