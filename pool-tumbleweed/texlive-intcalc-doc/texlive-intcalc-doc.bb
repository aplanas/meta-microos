SUMMARY = "Documentation for texlive-intcalc"
DESCRIPTION = "This package includes the documentation for texlive-intcalc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53168"

RPM_NAME = "texlive-intcalc-doc-2023.209.1.3svn53168-54.1.noarch.rpm"
RPM_HASH = "246faa7e6beae661c16ccd346f2c7497fc49b35e5edb687e99e587c71088e0d8710ecdd41a679d706739223a9ffaaa5fcea2ee87904bfcff0337c7cf555bd5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
