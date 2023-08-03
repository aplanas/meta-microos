SUMMARY = "Documentation for texlive-grid"
DESCRIPTION = "This package includes the documentation for texlive-grid"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-grid-doc-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "4f78308cfcfc8611ba2e0651d723b605587690295a8c5a0d6b09524c9089f766b741bf2e2d4bb7f6605d583a127c518a0c0ccf09a2953f523a4b18d863cff408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-doc"

RDEPENDS:${PN} += ""

inherit rpm
