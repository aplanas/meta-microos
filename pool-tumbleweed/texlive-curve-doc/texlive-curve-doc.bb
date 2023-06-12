SUMMARY = "Documentation for texlive-curve"
DESCRIPTION = "This package includes the documentation for texlive-curve"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.16svn20745"

RPM_NAME = "texlive-curve-doc-2023.204.1.16svn20745-54.1.noarch.rpm"
RPM_HASH = "79b368a6fe3a0c07afbc7335be98dad03617afac1390759bc2f50af118f5678e796ee3af98c7edd7b4bf58296e1d9502a0a07be48d9485d5a63691a9c6c81c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-curve-doc"
RDEPENDS:${PN} += ""

inherit rpm
