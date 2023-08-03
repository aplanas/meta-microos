SUMMARY = "Documentation for texlive-ellipse"
DESCRIPTION = "This package includes the documentation for texlive-ellipse"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39025"

RPM_NAME = "texlive-ellipse-doc-2023.209.1.0svn39025-54.1.noarch.rpm"
RPM_HASH = "4c9f477eae041ea53a1ce15a82782ba86561c4f0e5fc0e042487d069174ce3e2a2253b78a9a6c9b1ccc09c7871bb8402a69f6f68446ae748c352ce4d763a3d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipse-doc"

RDEPENDS:${PN} += ""

inherit rpm
