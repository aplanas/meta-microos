SUMMARY = "Documentation for texlive-pdfcol"
DESCRIPTION = "This package includes the documentation for texlive-pdfcol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn64469"

RPM_NAME = "texlive-pdfcol-doc-2023.201.1.7svn64469-51.1.noarch.rpm"
RPM_HASH = "1906b11f63d25bd739598dd88b1aee8db1bd910edb0d9b76eb2c6ee3d7beeb40a20c317fb554eda140cd5ab5e2315cda70f47258b35d1ce74e512a308e9de2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcol-doc"
RDEPENDS:${PN} += ""

inherit rpm
