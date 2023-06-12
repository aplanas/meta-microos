SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "terminfo-iterm-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "9f210c32ef1252c211947f0a05c9b927ea76557f5d92eea745e3ee4eb5d21a1e874bbc62005f570a9b88e05e1d3ce4fc7b408a3f1104734c21480d2f36f71097"

RPROVIDES:${PN} += "terminfo-iterm \
terminfo-iterm(aarch-64) \
terminfo:/usr/share/terminfo/i/iTerm.app"
RDEPENDS:${PN} += "terminfo-base"

inherit rpm
