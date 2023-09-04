SUMMARY = "Documentation for texlive-resphilosophica"
DESCRIPTION = "This package includes the documentation for texlive-resphilosophica"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-doc-2023.209.1.35svn50935-54.2.noarch.rpm"
RPM_HASH = "1d0bf91cf6b25e19ea657c0c287af74bed0ec29c874319066cc1d59578f23df53d8540dd22a590da156b54a96711caf86109793b6c752a6723c21edffde27b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resphilosophica-doc"

RDEPENDS:${PN} += ""

inherit rpm
