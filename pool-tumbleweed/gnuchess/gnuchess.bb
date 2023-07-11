SUMMARY = "GNU Chess Program"
DESCRIPTION = "A worthy chess opponent that runs in text mode. Find an X11 interface \
in the xboard package."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.9"

RPM_NAME = "gnuchess-6.2.9-2.8.aarch64.rpm"
RPM_HASH = "385e5f6fbde6c7532d8efab812d21d6370a5ae090ed0151a0a07f832155bbd923e87229939bf968567c05fbcca47b26dfaa0def0c066031867a4958148568255"

RPROVIDES:${PN} += "chess-backend \
gchess \
gnuchess"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
