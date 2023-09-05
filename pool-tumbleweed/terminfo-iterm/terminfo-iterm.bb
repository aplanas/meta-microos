SUMMARY = "A terminal descriptions database for iterm"
DESCRIPTION = "This package includes some useful entries for the iterm utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "terminfo-iterm-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "92226822ff5c575602fbcd71e51a574b2609eac01a238e7cf2dd226a846bcc4c46b0a1ba413d5a78ae1418ece9363d05d5b87990aa905c2cbcbf383ba9dd0dc0"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/i/iTerm.app \
terminfo-iterm"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
