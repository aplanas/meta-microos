SUMMARY = "Documentation for texlive-pdfx"
DESCRIPTION = "This package includes the documentation for texlive-pdfx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.3svn50338"

RPM_NAME = "texlive-pdfx-doc-2023.209.1.6.3svn50338-52.1.noarch.rpm"
RPM_HASH = "23dc404b4915ab9dcdb7deaca3bb5ad6ea1ac141e1342f3bd975397b57bcd7cbe47bf43fb8683020c653faea3c226602023a9598a1017063d302515d1b1a5aa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfx-doc"

RDEPENDS:${PN} += ""

inherit rpm
