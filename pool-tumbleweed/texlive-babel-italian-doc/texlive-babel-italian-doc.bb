SUMMARY = "Documentation for texlive-babel-italian"
DESCRIPTION = "This package includes the documentation for texlive-babel-italian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.07svn62890"

RPM_NAME = "texlive-babel-italian-doc-2023.209.1.4.07svn62890-54.1.noarch.rpm"
RPM_HASH = "fb0eb204ccca0474b098ad8c16faab23369cc31665c5ba5b70446f9b44934c493e825b945b71532917dd8de059e613981ef8a10f038b6a04e8bf889444781d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
