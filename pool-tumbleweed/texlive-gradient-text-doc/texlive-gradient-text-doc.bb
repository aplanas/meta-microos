SUMMARY = "Documentation for texlive-gradient-text"
DESCRIPTION = "This package includes the documentation for texlive-gradient-text"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65567"

RPM_NAME = "texlive-gradient-text-doc-2023.209.1.2svn65567-54.1.noarch.rpm"
RPM_HASH = "a1573db3734c6856dbc208afa066ba49d934a568664d7042c56ff5a924b17e7bdfb2983a1afa79218f57ccba526e0ec85a3deafde979e9927e78b962b24bfa7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradient-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
