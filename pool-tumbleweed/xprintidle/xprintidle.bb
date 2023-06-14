SUMMARY = "Utility to print user's idle time in X"
DESCRIPTION = "An utility that queries the X server for the user's idle time and \
prints it to stdout (in milliseconds)."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "xprintidle-0.2.5-1.1.aarch64.rpm"
RPM_HASH = "e9d77c6dfc303b7473b79f119a9ade25b3f9301d1abbe6d89196862e76527ff86560e3d6aeadac31e457144887dc916f49cc79967341fee253ce6032757e2eef"

RPROVIDES:${PN} += "xprintidle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXss.so.1 \
libc.so.6"

inherit rpm
