SUMMARY = "Documentation for texlive-xstring"
DESCRIPTION = "This package includes the documentation for texlive-xstring"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.85svn65551"

RPM_NAME = "texlive-xstring-doc-2023.209.1.85svn65551-53.2.noarch.rpm"
RPM_HASH = "61d6f4d135b55970d77bc8b0d0313ee9f0e2a679adbc020c58a8b0a14c2b0f8933448c93a1c272e510b1ddb09686041a803d9abb928ffc84d33d3ef1b5609b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xstring-doc-en;fr \
texlive-xstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
