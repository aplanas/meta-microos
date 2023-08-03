SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "terminfo-iterm-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "46626c1d7ae29e7faa2423b60155c77f6ac1ee2b1410ddf335756a06e658bead808646451d8c7c4b1fddf82cb6f125abbd75d0bed7a3d8f7b43e63b2c168e33e"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/i/iTerm.app \
terminfo-iterm"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
