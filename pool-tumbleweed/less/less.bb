SUMMARY = "Text File Browser and Pager Similar to more"
DESCRIPTION = "less is a text file browser and pager similar to more. It allows \
backward as well as forward movement within a file. Also, less does not \
have to read the entire input file before starting. It is possible to \
start an editor at any time from within less."
LICENSE = "BSD-2-Clause | GPL-3.0-or-later"

PV = "643"

RPM_NAME = "less-643-1.1.aarch64.rpm"
RPM_HASH = "9d814e4d93fd6517f04182e467d8634302c5cb99d1b94ec102bace96fc6ad6241bdeab1ff4dc2a03062490d4125266e3797e77f8c1af101f4610ccfccf9bfd81"

RPROVIDES:${PN} += "less"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/bin/which \
file \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
