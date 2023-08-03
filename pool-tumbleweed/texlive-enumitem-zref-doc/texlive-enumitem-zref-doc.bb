SUMMARY = "Documentation for texlive-enumitem-zref"
DESCRIPTION = "This package includes the documentation for texlive-enumitem-zref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn21472"

RPM_NAME = "texlive-enumitem-zref-doc-2023.209.1.8svn21472-54.1.noarch.rpm"
RPM_HASH = "87894d56821dbedcc3b140544faf0ca7a6da019c14c7c49ca4679b6c3108a0a17960619a8d799b0152a9f2bd1d9a29484eb1f824267298351fc73b52db18940d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enumitem-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
