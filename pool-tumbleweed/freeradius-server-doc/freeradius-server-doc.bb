SUMMARY = "FreeRADIUS Documentation"
DESCRIPTION = "FreeRADIUS documentation."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-doc-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "6b5f47b5a7933c950a0d81ade709f382973e1399c0d49b76a54ce2eb0484ac6bf8af2e0ac1ba1df3ee3a83092d4b4090174ab54438beb77f0bd699ed9a5b64d9"

RPROVIDES:${PN} += "freeradius-server-doc"

RDEPENDS:${PN} += ""

inherit rpm
