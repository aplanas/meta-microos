SUMMARY = "A keyboard shortcut daemon"
DESCRIPTION = "actkbd is a daemon that reacts to user defined keys and launches specific \
commands. It can be used to utilize multimedia keys on simple setups, or \
assigned custom actions to rarely used keys."
LICENSE = "GPL-2.0-only"

PV = "0.2.8"

RPM_NAME = "actkbd-0.2.8-6.3.aarch64.rpm"
RPM_HASH = "028c25cb9aa8010d0e7624d1a1ee81944cf444611116a252c033119c2e2d7cba2cc58e1b9717094eacea5450902bd1929ed43bde9d168d7d32d3b875adb5127d"

RPROVIDES:${PN} += "actkbd \
config-actkbd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
