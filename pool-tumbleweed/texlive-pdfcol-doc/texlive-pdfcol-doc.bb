SUMMARY = "Documentation for texlive-pdfcol"
DESCRIPTION = "This package includes the documentation for texlive-pdfcol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn64469"

RPM_NAME = "texlive-pdfcol-doc-2023.209.1.7svn64469-52.1.noarch.rpm"
RPM_HASH = "5dae369bb89eb17cc7b15e90466f37c13fd7a34947ce88e8c3f0c059bf4b55be0c436e28fa5022df81732e7b4e0ed689f8fb3ee7472d9adff8f6eb9f604a9206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
