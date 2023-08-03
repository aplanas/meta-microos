SUMMARY = "Documentation for texlive-guitartabs"
DESCRIPTION = "This package includes the documentation for texlive-guitartabs"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn48102"

RPM_NAME = "texlive-guitartabs-doc-2023.209.svn48102-54.1.noarch.rpm"
RPM_HASH = "f9bcf5725c550848a70bfb10c31fd7f30e1c664712e2a2aa760556c4ad69b7ef05ac6b0900dc9f3670cb5a9dceebcda1bf42eab8e0af714d02cf78b46e6e1d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitartabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
