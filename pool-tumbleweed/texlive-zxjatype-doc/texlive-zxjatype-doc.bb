SUMMARY = "Documentation for texlive-zxjatype"
DESCRIPTION = "This package includes the documentation for texlive-zxjatype"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-doc-2023.209.0.0.7svn53500-53.2.noarch.rpm"
RPM_HASH = "1363c5387e1ebf8923764d20b269a5ef3ac364662959cabe0570dfef7553f9326046fd0476c3b016717d2c367aa27ff88f0664704a7b9c75ad30b3dd7f43a86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjatype-doc-ja \
texlive-zxjatype-doc"

RDEPENDS:${PN} += ""

inherit rpm
