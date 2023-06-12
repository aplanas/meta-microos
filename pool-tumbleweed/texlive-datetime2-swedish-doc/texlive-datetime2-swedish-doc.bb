SUMMARY = "Documentation for texlive-datetime2-swedish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-swedish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36700"

RPM_NAME = "texlive-datetime2-swedish-doc-2023.201.1.0svn36700-52.1.noarch.rpm"
RPM_HASH = "944b3b32f38d2438addecb74553ee546a2d19d755ab6428dd88b8ef0375546e7a825f177e0dcb0ad928bb198e2390eab72fa30c0a74a517a058815d73eaff484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-swedish-doc"
RDEPENDS:${PN} += ""

inherit rpm
