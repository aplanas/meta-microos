SUMMARY = "Displays where a particular program in your path is located"
DESCRIPTION = "The which command shows the full pathname of a specified program, if \
the specified program is in your PATH."
LICENSE = "GPL-3.0-or-later"

PV = "2.21"

RPM_NAME = "which-2.21-5.10.aarch64.rpm"
RPM_HASH = "9463f097f16c871f5ee37d2c02bf3c3cb609700687fe45f7ba1abbbbc7d66ddac7a799b045aab233c5c735632d3673e2b3a84054e6e0c7091f479dcb87612ebd"

RPROVIDES:${PN} += "util-linux-/usr/bin/which \
which"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
