SUMMARY = "Documentation for texlive-autonum"
DESCRIPTION = "This package includes the documentation for texlive-autonum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.11svn36084"

RPM_NAME = "texlive-autonum-doc-2023.209.0.0.3.11svn36084-54.1.noarch.rpm"
RPM_HASH = "dfb10b39bb788ce888d49a539143293671fc46f1c6cfb3c5fd2c2e023983fc16585bb3412339fd7273e954042d2de6223a640cf38a31f171a2d37181dc2ef5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autonum-doc"

RDEPENDS:${PN} += ""

inherit rpm
