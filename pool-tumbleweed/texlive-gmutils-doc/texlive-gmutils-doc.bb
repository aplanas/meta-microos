SUMMARY = "Documentation for texlive-gmutils"
DESCRIPTION = "This package includes the documentation for texlive-gmutils"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-doc-2023.209.0.0.996svn24287-54.2.noarch.rpm"
RPM_HASH = "f1c3c66368526d7b7568a96305a7ef067ae538513530990eb15affc0b02ccad136a78d7f2c1408cb52e2cdfe48451cdece90ae490bddb8061dc69d5937ebc0d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
