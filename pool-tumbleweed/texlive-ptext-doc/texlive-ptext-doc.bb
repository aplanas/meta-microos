SUMMARY = "Documentation for texlive-ptext"
DESCRIPTION = "This package includes the documentation for texlive-ptext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30171"

RPM_NAME = "texlive-ptext-doc-2023.209.1.1svn30171-54.2.noarch.rpm"
RPM_HASH = "30867a5bc3e6adcafca15e7bf4e6a28d388ae3f0e5eaf2bf45274f1c22027538429ae524c1d470e7f1cbec38595e8e1f557f19acd9abc2b8daf7f2e5d1f7db0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ptext-doc-fa \
texlive-ptext-doc"

RDEPENDS:${PN} += ""

inherit rpm
