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

RPM_NAME = "clisp-doc-2.49.92-5.4.noarch.rpm"
RPM_HASH = "0c651c44d49c5cdac8beb046217cb9110eb8aa845c758cf6e1a0cf94733a93a45012d3094b4be242e2eeea7f946382ba6b760da72422a944c907dd97e7b9e37b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clisp-doc"

RDEPENDS:${PN} += "clisp"

inherit rpm
