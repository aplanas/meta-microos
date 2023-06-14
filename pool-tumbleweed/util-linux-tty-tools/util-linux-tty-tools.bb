SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "util-linux-tty-tools-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "b5a8b067958f30a87ebddd8afd63b0bcf3ff1702a05b25569bcfb73dcec3027a674e6ad66582b1c3e7b141dc9367cbfdef15535773b824f1f53428779043ef1c"

RPROVIDES:${PN} += "util-linux-/usr/bin/mesg \
util-linux-/usr/bin/wall \
util-linux-/usr/bin/write \
util-linux-tty-tools"

RDEPENDS:${PN} += "/bin/sh \
group-tty \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions"

inherit rpm
