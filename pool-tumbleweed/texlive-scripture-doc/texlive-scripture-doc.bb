SUMMARY = "Documentation for texlive-scripture"
DESCRIPTION = "This package includes the documentation for texlive-scripture"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn65493"

RPM_NAME = "texlive-scripture-doc-2023.209.1.3svn65493-54.1.noarch.rpm"
RPM_HASH = "8007b6d805b3f4cb1bcaef98837f89e7fb62c520ad2ed9fed68391d2f10f2db91b4d79832b2089b81d17a44139aa28b5154a8e2bcedc011d45d3c3570cec6b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scripture-doc"

RDEPENDS:${PN} += ""

inherit rpm
