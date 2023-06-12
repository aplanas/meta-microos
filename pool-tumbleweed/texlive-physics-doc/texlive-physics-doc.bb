SUMMARY = "Documentation for texlive-physics"
DESCRIPTION = "This package includes the documentation for texlive-physics"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn28590"

RPM_NAME = "texlive-physics-doc-2023.201.1.3svn28590-51.1.noarch.rpm"
RPM_HASH = "faaf9aa45c612e942947be792c8a68266ba2b1e3586748781cafc8ef7d054a0577c47dadc718cd2583a5120d807f3e70be93e7ed77aed381b62361fa3bf0226b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics-doc"
RDEPENDS:${PN} += ""

inherit rpm
