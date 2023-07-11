SUMMARY = "Text File Browser and Pager Similar to more"
DESCRIPTION = "less is a text file browser and pager similar to more. It allows \
backward as well as forward movement within a file. Also, less does not \
have to read the entire input file before starting. It is possible to \
start an editor at any time from within less."
LICENSE = "BSD-2-Clause | GPL-3.0-or-later"

PV = "633"

RPM_NAME = "less-633-2.2.aarch64.rpm"
RPM_HASH = "7175199c2062880e3e90da56a27f4c84261ed1c1086075dfeb15ce10d64f96e7cd8d1a136ecd63c136c164b6aecd6f0d0338af3eeab5827b5d1b93b91b0d8181"

RPROVIDES:${PN} += "less"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
/usr/bin/which \
file \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
