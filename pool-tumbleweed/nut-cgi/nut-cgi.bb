SUMMARY = "Network UPS Tools Web Server Support (UPS Status Pages)"
DESCRIPTION = "Web server support package for the Network UPS Tools. \
 \
Predefined URL is http://localhost/nut/index.html \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-cgi-2.8.0-2.1.aarch64.rpm"
RPM_HASH = "956694828d486dad79122bf71d5ee1c9d41f1d8c743cb1480a72ac5a2d26231ca94f18a61fd14eb35e272c2c01322ae6015089c10f83c01213aae2be527fa4cc"

RPROVIDES:${PN} += "config-nut-cgi \
nut-cgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libupsclient.so.6 \
nut"

inherit rpm
