SUMMARY = "Documentation of CLisp"
DESCRIPTION = "CLISP documentation is placed in the following directories: \
 \
/usr/share/doc/packages/clisp/ \
 \
/usr/share/doc/packages/clisp/doc/ \
 \
As well as the conventional CLISP, this package also includes CLX, an \
extension of CLISP for the X Window System. The X Window System must be \
installed before running the clx command. The description of this CLX \
version (new-clx) is placed in \
 \
/usr/share/doc/packages/clisp/clx/ \
 \
with the file README. The subdirectory \
 \
/usr/share/doc/packages/clisp/clx/demos/ \
 \
contains two nice applications."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.49.92"

RPM_NAME = "clisp-doc-2.49.92-5.6.noarch.rpm"
RPM_HASH = "224c691f6efb90fdba80f046761138e306ee75ab8d50367d711f6a034d8128b7f3b230a45d3a2459f3ad7f918b872b509dd8ba944f69b8256a7bad3702120815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clisp-doc"

RDEPENDS:${PN} += "clisp"

inherit rpm
