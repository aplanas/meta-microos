SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "terminfo-screen-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "2f428d5aa869d007d1012dc06b68d38002791a8b800aa719e8c1b393d14579bdfa9d3937176720f106d1508e5a607bf38cdc92fb20fb732d173d3d3eec2a2f5b"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/s/screen.konsole \
terminfo-screen"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
