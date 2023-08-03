SUMMARY = "Documentation for texlive-ucsmonograph"
DESCRIPTION = "This package includes the documentation for texlive-ucsmonograph"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.0svn52698"

RPM_NAME = "texlive-ucsmonograph-doc-2023.209.1.3.0svn52698-54.1.noarch.rpm"
RPM_HASH = "24ea4a81a51db7bc986506d862d55ef34f6112ca8aa33633a8f6e4d359966194f02340bd2ffa9870ec3dd03901c4665f73fd39a69f9f6b57eaf239332db86a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ucsmonograph-doc-pt-BR \
texlive-ucsmonograph-doc"

RDEPENDS:${PN} += ""

inherit rpm
