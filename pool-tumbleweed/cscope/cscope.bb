SUMMARY = "Interactive Tool for Browsing C Source Code"
DESCRIPTION = "Cscope is an interactive, screen-oriented tool that allows the user to \
browse through C source code files for specified elements of code."
LICENSE = "BSD-3-Clause"

PV = "15.9"

RPM_NAME = "cscope-15.9-1.14.aarch64.rpm"
RPM_HASH = "918ee71311a31db89eb34ff178d18f1c60f91737414049d704efae2cc878d7f0a024d99600616bfe3b2126bec1cecbd628228a54ba5102904d33b85270a23606"

RPROVIDES:${PN} += "cscope"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
