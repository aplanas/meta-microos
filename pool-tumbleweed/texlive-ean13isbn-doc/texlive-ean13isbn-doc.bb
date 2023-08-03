SUMMARY = "Documentation for texlive-ean13isbn"
DESCRIPTION = "This package includes the documentation for texlive-ean13isbn"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn57514"

RPM_NAME = "texlive-ean13isbn-doc-2023.209.svn57514-54.1.noarch.rpm"
RPM_HASH = "ac959267fbdddd13bae0f1e795899ef61287d1d7b2a200037cc93922595e2a1b9a947909dd3ad0c22858a75cafaa4c0a242c5793ecbb20c683b24a1c07cf5668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ean13isbn-doc"

RDEPENDS:${PN} += ""

inherit rpm
