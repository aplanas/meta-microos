SUMMARY = "Documentation for texlive-keyparse"
DESCRIPTION = "This package includes the documentation for texlive-keyparse"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn60277"

RPM_NAME = "texlive-keyparse-doc-2023.209.1.1svn60277-56.1.noarch.rpm"
RPM_HASH = "32e54dc489e223d25ef8b96cac9e378617c06abb94cd3023eec7155a68b14b021a47f16fe18ffb894031f224145885d56a2f300d03450d0eba421870e0e3c50b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyparse-doc"

RDEPENDS:${PN} += ""

inherit rpm
