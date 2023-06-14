SUMMARY = "IRC for SeaMonkey"
DESCRIPTION = "An IRC client (Chatzilla) for SeaMonkey."
LICENSE = "MPL-2.0"

PV = "2.53.16"

RPM_NAME = "seamonkey-irc-2.53.16-1.2.aarch64.rpm"
RPM_HASH = "66ba2e998fc9a34aca1d875e27e5e8758da9723835bfa132f0f6de8d8aca21ffe19813dc59a6ea951997d0d425d24a7f2d5f26c4a4b6bcd5da3c5ac8a8efe5c4"

RPROVIDES:${PN} += "seamonkey-irc"

RDEPENDS:${PN} += "seamonkey"

inherit rpm
