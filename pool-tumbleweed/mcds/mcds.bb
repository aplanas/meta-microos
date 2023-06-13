SUMMARY = "Mutt Carddav search program"
DESCRIPTION = "mcds is a command line tool primarily used as a search query plugin \
for mutt to query a carddav server."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "mcds-1.6-1.13.aarch64.rpm"
RPM_HASH = "3c264a5c9276243d7e1a158b61273bd5e77650664c6d5084a1087b970cec0488bf7d48ca846b8aea669de60da4e5c7d1d8f378293e0d22437604b2c021228bef"

RPROVIDES:${PN} += "mcds \
mcds(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgpgme.so.11()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
