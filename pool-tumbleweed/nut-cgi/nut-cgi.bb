SUMMARY = "Network UPS Tools Web Server Support (UPS Status Pages)"
DESCRIPTION = "Web server support package for the Network UPS Tools. \
 \
Predefined URL is http://localhost/nut/index.html \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-cgi-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "c1b25f4e10d6525552c2a02c5a24605bc5efe367a1fea115e1d5db0bd813d0af152e8a0a53f81eddfabca7001c0bf865bcef71feebf4b1038dcb757955810161"

RPROVIDES:${PN} += "config-nut-cgi \
nut-cgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libupsclient.so.6 \
nut"

inherit rpm
