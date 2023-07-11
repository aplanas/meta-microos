SUMMARY = "An arcade-style vertical scrolling shooter"
DESCRIPTION = "OpenTyrian is a port of the DOS shoot-em-up Tyrian. Thanks to Jason Emery, \
the developers were given a copy of the Tyrian source to port but \
not redistribute. That code has since been ported from Turbo Pascal to C \
using SDL, making it easily cross-platform. The 'Classic' port involves \
minimal changes, but the 'Enhanced' port will feature further development. \
Tyrian is an arcade-style vertical scrolling shooter. The story is set \
in 20,031 where you play as Trent Hawkins, a skilled fighter-pilot employed \
to fight Microsol and save the galaxy."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.20221123"

RPM_NAME = "opentyrian-2.1.20221123-1.4.aarch64.rpm"
RPM_HASH = "2bbbd0b96ff63a7be4ca83e630e89b669f194c693e89d29a2b914302e25d7b42e2c5e92076ec0f71c27e6971a8562efd8333f4411afce57a0d0be30ca87ceaa6"

RPROVIDES:${PN} += "opentyrian"

RDEPENDS:${PN} += "/usr/bin/sh \
libSDL2-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
