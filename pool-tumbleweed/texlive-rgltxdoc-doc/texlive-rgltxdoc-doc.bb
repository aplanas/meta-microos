SUMMARY = "Documentation for texlive-rgltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-rgltxdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-doc-2023.209.1.3svn53858-54.1.noarch.rpm"
RPM_HASH = "6ae96a1e7323a91995917bab8f8e69d9192d68c5af0308526a8d89091d5864a6a617fedfd8d9f1974713b2b8ac66dba74b8bce10393206ac57635731795e7ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rgltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
