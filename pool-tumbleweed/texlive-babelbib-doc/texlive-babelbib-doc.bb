SUMMARY = "Documentation for texlive-babelbib"
DESCRIPTION = "This package includes the documentation for texlive-babelbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn57349"

RPM_NAME = "texlive-babelbib-doc-2023.201.1.34svn57349-53.1.noarch.rpm"
RPM_HASH = "7139c9359c5c56a94a9b1ee80ab77bf66c55f9ce946c69981ba651651fb44a2b32918083e6d96e0f9191ee4d1f62fc1a6d7f3c92b679d64dabaecbf5d6c88312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babelbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
