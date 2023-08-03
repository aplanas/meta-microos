SUMMARY = "Documentation for texlive-modroman"
DESCRIPTION = "This package includes the documentation for texlive-modroman"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn29803"

RPM_NAME = "texlive-modroman-doc-2023.209.1svn29803-55.1.noarch.rpm"
RPM_HASH = "b706fabdd6f02c6546c2b7c9f5c3f7c7b7548a1c437ec296bf9b63b0bb51e0151a35bd5826c882299e0c700be7d0f949ec5d9f7baa5cc297a634c9bbdbd86e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-modroman-doc-en;fr \
texlive-modroman-doc"

RDEPENDS:${PN} += ""

inherit rpm
