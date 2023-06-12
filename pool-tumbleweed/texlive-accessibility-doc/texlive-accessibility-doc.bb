SUMMARY = "Documentation for texlive-accessibility"
DESCRIPTION = "This package includes the documentation for texlive-accessibility"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.3svn55777"

RPM_NAME = "texlive-accessibility-doc-2023.201.2.0.3svn55777-54.1.noarch.rpm"
RPM_HASH = "02c944ed89091a19d0aac14b5ff78e85bc413147aa3ea029d13da4c72147a1a6234aa764b50fb7a61fe8f7408bc0a22b3e75ce058cfe33f546b2bb3d02636610"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-accessibility-doc:de;en) \
texlive-accessibility-doc"
RDEPENDS:${PN} += ""

inherit rpm
