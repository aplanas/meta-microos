SUMMARY = "Documentation for texlive-qsymbols"
DESCRIPTION = "This package includes the documentation for texlive-qsymbols"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qsymbols-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "c00833590040d8485d67fb0fa07404889ee59a2acb28f450db597e2819e725c5d2f6c3d75b0a3deb3ff16b50d79fc0f244183639fc89fa07fde1e15c2841a93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
