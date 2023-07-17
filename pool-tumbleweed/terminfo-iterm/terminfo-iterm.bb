SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230701"

RPM_NAME = "terminfo-iterm-6.4.20230701-16.1.aarch64.rpm"
RPM_HASH = "eaef668613695ed67fc94a3eabe68dde11bf1989f87a4037c97ccf13a210976a43c2ca7416695f8e797322efd03126b86b859dae7ddeb457ea93538de6f8da97"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/i/iTerm.app \
terminfo-iterm"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
