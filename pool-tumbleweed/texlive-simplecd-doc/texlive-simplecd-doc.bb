SUMMARY = "Documentation for texlive-simplecd"
DESCRIPTION = "This package includes the documentation for texlive-simplecd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn29260"

RPM_NAME = "texlive-simplecd-doc-2023.209.1.4svn29260-54.1.noarch.rpm"
RPM_HASH = "04b359ab154db042cee0d213a96b0e94080156c53131027fbce0622bce785ff9bb946c8fccd42d56620183a968484de09ae7fe37d7cb94a9814a9d25d5c43e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplecd-doc"

RDEPENDS:${PN} += ""

inherit rpm
