SUMMARY = "An ncurses spreadsheet program for terminal"
DESCRIPTION = "Spreadsheet Calculator Improvised, aka sc-im, is an ncurses based, \
vim-like spreadsheet calculator. \
 \
sc-im is based on sc, whose original authors are James Gosling and \
Mark Weiser, and mods were later added by Chuck Martin."
LICENSE = "BSD-4-Clause"

PV = "0.8.3"

RPM_NAME = "sc-im-0.8.3-1.1.aarch64.rpm"
RPM_HASH = "1e7cf49ed0710b5a6626c3f91264ca77333b92f6f0d54a2308508c2bf0583aad6a5dd7f55eb15fd1a948ffd77467d6cccae2a83f8fbe610fe20c01eda2155a7b"

RPROVIDES:${PN} += "sc-im"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libxlsreader.so.8 \
libxlsxwriter.so.5 \
libxml2.so.2 \
libzip.so.5"

inherit rpm
