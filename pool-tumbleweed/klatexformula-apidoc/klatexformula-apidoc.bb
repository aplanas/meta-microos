SUMMARY = "API documentation for KLatexFormula"
DESCRIPTION = "KLatexFormula is a graphical user interface for generating images \
from LaTeX equations. \
 \
This package contains the API documentation of the libraries libklfbackend and \
libklftool which are the different components of klatexformula."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klatexformula-apidoc-4.1.0-1.14.noarch.rpm"
RPM_HASH = "92492e2f920183389390ffc959031f5e41d60c0225fd08185014a657000813a12c06c39d4053c976ac3ec6d16a6c02e16205d8c1af8a6d26055d17fc2026c990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klatexformula-apidoc"

RDEPENDS:${PN} += "klatexformula"

inherit rpm
