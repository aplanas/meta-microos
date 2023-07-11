SUMMARY = "Enjoy playing with Sudoku boards designed by yourself"
DESCRIPTION = "The engine solves sudokus by applying complex logical rules a few times, \
instead of applying simpler rules (like guessing and backtracking) \
many many times. These complex logical rules are exactly the same ones \
that people use with paper and pen."
LICENSE = "GPL-2.0-or-later"

PV = "02_00"

RPM_NAME = "sudoku-sensei-02_00-3.10.aarch64.rpm"
RPM_HASH = "91f27eb43099bd1e682aa744bdc055e7394168e176eaedfbd477e687593f78536e5738cf13db4081487d4bc07adfc43db402e3264f51e7f5f07e80ee583db3e2"

RPROVIDES:${PN} += "sudoku-sensei"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
