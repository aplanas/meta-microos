SUMMARY = "Documentation for texlive-handoutwithnotes"
DESCRIPTION = "This package includes the documentation for texlive-handoutwithnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62140"

RPM_NAME = "texlive-handoutwithnotes-doc-2023.201.1.3svn62140-53.1.noarch.rpm"
RPM_HASH = "0a1a6639617214dc8a510f5973344caa5a8c2694db6344496209694070dc671c93a87a7e396082676703b9c8cdd5bbb84e10f0d1d71a17cac4950204108ee2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handoutwithnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
