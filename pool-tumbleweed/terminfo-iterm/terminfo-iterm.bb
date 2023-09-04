SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "terminfo-iterm-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "1d713a561d27240b2d8cc8b18be981f585812fb3cdcce9055e73587097e39ea6484388aca4fe50bb3a31599649b7c851ace51ae7e96706390516a6f83e9dbd37"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/i/iTerm.app \
terminfo-iterm"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
