SUMMARY = "Documentation for texlive-ionumbers"
DESCRIPTION = "This package includes the documentation for texlive-ionumbers"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3.3svn33457"

RPM_NAME = "texlive-ionumbers-doc-2023.209.0.0.3.3svn33457-56.1.noarch.rpm"
RPM_HASH = "7545cf0ba22a934a6d9ecf795bde54dabf58d66e820e9440b00b7d5bac0855bd75492a9891fa760efc940860eb61f230525814792d631ca394649e271ef173a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ionumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
