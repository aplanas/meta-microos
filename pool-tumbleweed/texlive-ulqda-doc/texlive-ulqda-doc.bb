SUMMARY = "Documentation for texlive-ulqda"
DESCRIPTION = "This package includes the documentation for texlive-ulqda"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn26313"

RPM_NAME = "texlive-ulqda-doc-2023.201.1.1svn26313-53.1.noarch.rpm"
RPM_HASH = "16f9a63dacc852c0f2b0f5d063d665a9bbe0d410a7534a239fa24fef9c6cc720880327cff72356a774464491acc01d97feb48c0f0de2fcd2fed476a4d5483cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ulqda-doc"

RDEPENDS:${PN} += ""

inherit rpm
