SUMMARY = "Compare font hinting modes"
DESCRIPTION = "Compare font hinting modes \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftdiff-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "d6c94582bc90421bddc3da1a2000f4c24d9be66457e909a21ce0edb3c14b1f9293bd3594c8063e849d97589a774bcc65d2d172a2f95fa24437a9b290da37af7f"

RPROVIDES:${PN} += "ftdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfreetype.so.6 \
librsvg-2.so.2"

inherit rpm
