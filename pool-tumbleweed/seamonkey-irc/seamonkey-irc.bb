SUMMARY = "IRC for SeaMonkey"
DESCRIPTION = "An IRC client (Chatzilla) for SeaMonkey."
LICENSE = "MPL-2.0"

PV = "2.53.17"

RPM_NAME = "seamonkey-irc-2.53.17-1.1.aarch64.rpm"
RPM_HASH = "5408c13744d9cd2af9608294922cf0e4058e16e55aa375f52f89ab966e2dc506c7e40fbafecfcf319aabcb09f7ca41b1cb331a4d059cde45e7496e6169a872d2"

RPROVIDES:${PN} += "seamonkey-irc"

RDEPENDS:${PN} += "seamonkey"

inherit rpm
