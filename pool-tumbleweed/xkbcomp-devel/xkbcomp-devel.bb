SUMMARY = "Utility to compile XKB keyboard description -- Development Files"
DESCRIPTION = "The xkbcomp keymap compiler converts a description of an XKB keymap \
into one of several output formats."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "xkbcomp-devel-1.4.6-1.3.aarch64.rpm"
RPM_HASH = "24756608f6b28ec036166d91d973bf93ae356ae2d1d0c116e7233347377f619997f97df7b842266295becc1e146596db45823fefb36e5b47facfbc0aa2453103"

RPROVIDES:${PN} += "pkgconfig-xkbcomp \
xkbcomp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xkbcomp"

inherit rpm
