SUMMARY = "Documentation for texlive-chess"
DESCRIPTION = "This package includes the documentation for texlive-chess"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn20582"

RPM_NAME = "texlive-chess-doc-2023.209.1.2svn20582-54.1.noarch.rpm"
RPM_HASH = "6524c14622c5a5c95322caf3e5c649cc3c207cbb1077a63e9f6ba8a813fc8df667cc5fff19c9ec18d5ad092fb4bfd6ebca2548f6fae3156fad1013fb17cae67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chess-doc"

RDEPENDS:${PN} += ""

inherit rpm
