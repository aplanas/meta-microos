SUMMARY = "Documentation for texlive-pst-func"
DESCRIPTION = "This package includes the documentation for texlive-pst-func"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99svn60933"

RPM_NAME = "texlive-pst-func-doc-2023.209.0.0.99svn60933-53.1.noarch.rpm"
RPM_HASH = "2834418e6b705ccf72e953edfc7ab6cb0fc1b91757f29bfcfc750cfbb65c906f16a1da17073e3b8315016982df38f77befd5bcd13b1e0384ff2b255f1c7e07b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-func-doc"

RDEPENDS:${PN} += ""

inherit rpm
