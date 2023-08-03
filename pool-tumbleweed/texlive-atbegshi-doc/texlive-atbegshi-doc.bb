SUMMARY = "Documentation for texlive-atbegshi"
DESCRIPTION = "This package includes the documentation for texlive-atbegshi"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.19svn53051"

RPM_NAME = "texlive-atbegshi-doc-2023.209.1.19svn53051-54.1.noarch.rpm"
RPM_HASH = "4e37cd1f3cd31874d13fb1d8d9ed9685a8570b820424eddc3b0b2eb8ba8b83a2dc6ad54e0f29ac405ce6712a9356b814d210214dc03052290b38eee5f7d79cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atbegshi-doc"

RDEPENDS:${PN} += ""

inherit rpm
