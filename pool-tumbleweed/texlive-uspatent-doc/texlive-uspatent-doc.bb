SUMMARY = "Documentation for texlive-uspatent"
DESCRIPTION = "This package includes the documentation for texlive-uspatent"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27744"

RPM_NAME = "texlive-uspatent-doc-2023.209.1.0svn27744-54.1.noarch.rpm"
RPM_HASH = "37291cb8410d814b8bef7586ef810f8a9e1f7e7c34dfec60ca4dc073332b04a4ce496afaae83acb2c59b9800b88c1b0943dd6235c2a60966949f4bcfb9145cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uspatent-doc"

RDEPENDS:${PN} += ""

inherit rpm
