SUMMARY = "Documentation for texlive-xstring"
DESCRIPTION = "This package includes the documentation for texlive-xstring"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.85svn65551"

RPM_NAME = "texlive-xstring-doc-2023.201.1.85svn65551-52.1.noarch.rpm"
RPM_HASH = "b9e6cea4a79c3479f351fc7531f56437e34f83b535c2fcca204b45a7825e29920d1438c01739d4ca940eb5c67155131acfe448f766bbdc7a9d3dee5409ab897b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xstring-doc:en;fr) \
texlive-xstring-doc"
RDEPENDS:${PN} += ""

inherit rpm
