SUMMARY = "Documentation for texlive-ekaia"
DESCRIPTION = "This package includes the documentation for texlive-ekaia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn49594"

RPM_NAME = "texlive-ekaia-doc-2023.201.1.06svn49594-53.2.noarch.rpm"
RPM_HASH = "3f603cf7b1f6c54d21ec02546c59553fde1b619b1964353a133736ddd3baf26258216f25c6bc42a3f8c5b54440e2d07d0f2519c9dfe747c18c5133d2d65c99ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekaia-doc"

RDEPENDS:${PN} += ""

inherit rpm
