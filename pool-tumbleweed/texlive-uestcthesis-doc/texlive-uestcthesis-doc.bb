SUMMARY = "Documentation for texlive-uestcthesis"
DESCRIPTION = "This package includes the documentation for texlive-uestcthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn36371"

RPM_NAME = "texlive-uestcthesis-doc-2023.209.1.1.0svn36371-54.1.noarch.rpm"
RPM_HASH = "3996187253aecaf34a4d042036e0d8045aae5538dd54a0d61915133001892261e714079ca34464068a1284e7eb927d21a5ab88482208ff54ad490dfaf2f33684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uestcthesis-doc-zh \
texlive-uestcthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
