SUMMARY = "Documentation for texlive-biblatex-multiple-dm"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-multiple-dm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn37081"

RPM_NAME = "texlive-biblatex-multiple-dm-doc-2023.209.1.0.1svn37081-54.1.noarch.rpm"
RPM_HASH = "9a71023fbec7fadac4635335a7bac6f05c39ef4b670ec368c86a27ec2f2213ba1e3a19c58d07426b3d9cf0c06b221374035d19ac38f758fc8cda0037ad7096c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-multiple-dm-doc"

RDEPENDS:${PN} += ""

inherit rpm
