SUMMARY = "Utility to list fonts served by X font server"
DESCRIPTION = "fslsfonts lists the fonts that match the given pattern."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "fslsfonts-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "4dcd60bdea330f529ae2477f85c0d4216e39b4cbfd41141f1def74823b072cb269a167bc2a06ba2387ab994ccfc26444806ebd0aa9b457ec3b4a09eb3fa42a39"

RPROVIDES:${PN} += "fslsfonts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFS.so.6 \
libc.so.6"

inherit rpm
