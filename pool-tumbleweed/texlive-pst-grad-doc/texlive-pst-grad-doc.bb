SUMMARY = "Documentation for texlive-pst-grad"
DESCRIPTION = "This package includes the documentation for texlive-pst-grad"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn15878"

RPM_NAME = "texlive-pst-grad-doc-2023.209.1.06svn15878-53.1.noarch.rpm"
RPM_HASH = "ea425ae0848daa2bebee1ba3a0c0113ac46a62b9feb279991da3f64899aab47a89c6207804a60c8568c28da30c72e64a002b1eeded0b603045cc4122fb6fffe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-grad-doc"

RDEPENDS:${PN} += ""

inherit rpm
