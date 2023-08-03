SUMMARY = "Documentation for texlive-pst-ovl"
DESCRIPTION = "This package includes the documentation for texlive-pst-ovl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07bsvn54963"

RPM_NAME = "texlive-pst-ovl-doc-2023.209.0.0.07bsvn54963-53.1.noarch.rpm"
RPM_HASH = "53f1fc7639772c68d0fb2ad381590f96e12f2ca4dabdd09ba38198e49ff8283d3e2bab4e4d268d9d73cd63a880e3cb7d7587b4fb376a0e1247310ede02647e1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-ovl-doc"

RDEPENDS:${PN} += ""

inherit rpm
