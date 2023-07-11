SUMMARY = "Documentation for texlive-intcalc"
DESCRIPTION = "This package includes the documentation for texlive-intcalc"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3svn53168"

RPM_NAME = "texlive-intcalc-doc-2023.208.1.3svn53168-53.1.noarch.rpm"
RPM_HASH = "93e8d591f8e32e7a114b4f1b23b3276feb67d074d6f4e6c7bad2769e2187d9d62afd3b12c3953d1e714c5c05bc03d4e1f6d52cb00e602a22a0901e0b2ee8027a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
