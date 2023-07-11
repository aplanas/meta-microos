SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "terminfo-iterm-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "b246362393bbe4bc83d8e1ecf9502ca599303ec899ebf2e7df89b2b5bc0832ad0035475361a1fd2e7dd72f4c0a565245e0e654e481fd458b99a20cf3e8209ed1"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/i/iTerm.app \
terminfo-iterm"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
