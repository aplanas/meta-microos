SUMMARY = "GNOME Interface for Various Networking Tools"
DESCRIPTION = "GNOME Nettool is a set of front-ends to various networking command line \
tools, like ping, netstat, ifconfig, whois, traceroute, and finger."
LICENSE = "GPL-2.0-or-later"

PV = "42.0"

RPM_NAME = "gnome-nettool-42.0-2.1.aarch64.rpm"
RPM_HASH = "438a7632b772abdc0a6e2a412fa1509e1be4e7d203d092b8ff761c338d9478a7fd554d3c15e88aa63ab442a96e282506d64400dc50bd1b6ef021ab13fffbfbb8"

RPROVIDES:${PN} += "gnome-nettool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libpango-1.0.so.0"

inherit rpm
