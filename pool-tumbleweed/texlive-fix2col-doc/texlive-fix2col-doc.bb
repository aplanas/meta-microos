SUMMARY = "Documentation for texlive-fix2col"
DESCRIPTION = "This package includes the documentation for texlive-fix2col"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn38770"

RPM_NAME = "texlive-fix2col-doc-2023.201.0.0.04svn38770-52.1.noarch.rpm"
RPM_HASH = "a86d434c61db67085067552f4af094537bca60f8ae04c229646c25316991946d2db6202c26eb2a27340ed501b9d12d3e064675cae2e4bdf897ed7a25b18c370d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fix2col-doc"

RDEPENDS:${PN} += ""

inherit rpm
