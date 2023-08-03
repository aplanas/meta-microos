SUMMARY = "Documentation for texlive-outline"
DESCRIPTION = "This package includes the documentation for texlive-outline"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18360"

RPM_NAME = "texlive-outline-doc-2023.209.svn18360-55.1.noarch.rpm"
RPM_HASH = "feae699e76f3a553dd215e3f12acfec27f090ef45f535884445c6a85f4ab4709fb2eadc04d342d020cceca4cff46d053a67082ba3d473299d5803ec169a14e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outline-doc"

RDEPENDS:${PN} += ""

inherit rpm
