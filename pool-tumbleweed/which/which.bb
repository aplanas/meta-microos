SUMMARY = "Displays where a particular program in your path is located"
DESCRIPTION = "The which command shows the full pathname of a specified program, if \
the specified program is in your PATH."
LICENSE = "GPL-3.0-or-later"

PV = "2.21"

RPM_NAME = "which-2.21-5.12.aarch64.rpm"
RPM_HASH = "cb68e68a85c82947ecdadf810b9506c25a0ac3edb876ba55a06f0103d4f1b063067be4c439691938ec8295547c631d55996fe949cc73d59b71381a42f635451a"

RPROVIDES:${PN} += "util-linux-/usr/bin/which \
which"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
