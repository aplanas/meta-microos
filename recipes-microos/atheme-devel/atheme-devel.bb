SUMMARY = "Development files for the Atheme IRC Services core"
DESCRIPTION = "Atheme is a set of modular IRC services (NickServ, ChanServ, etc.) \
designed to link with many kinds of IRCds. \
 \
This package contains the development headers for the library found \
in libathemecore1."
LICENSE = "MIT"

PV = "7.2.12"

RPM_NAME = "atheme-devel-7.2.12-2.9.aarch64.rpm"
RPM_HASH = "ed85fec70947779adf5b625fb7d1795692f800005e60e72540047f3b397bff153911228bd083ee7d2d54f8846516ff4472f6cd99a510ea1ff6853bdd60d0ce4b"

RPROVIDES:${PN} += "atheme-devel \
atheme-devel(aarch-64) \
pkgconfig(atheme-services)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libathemecore1"

inherit rpm
