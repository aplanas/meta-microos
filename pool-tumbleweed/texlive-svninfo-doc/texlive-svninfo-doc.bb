SUMMARY = "Documentation for texlive-svninfo"
DESCRIPTION = "This package includes the documentation for texlive-svninfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.4svn62157"

RPM_NAME = "texlive-svninfo-doc-2023.209.0.0.7.4svn62157-58.1.noarch.rpm"
RPM_HASH = "125a6f3451c1002ebbdf437b41db4a5436c33d50bd76fc369e0106abdbdf54055f1b3ed3357894bfce3a91cd98f4231ff7a8f1b3848f41348edd79ebc8834077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svninfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
