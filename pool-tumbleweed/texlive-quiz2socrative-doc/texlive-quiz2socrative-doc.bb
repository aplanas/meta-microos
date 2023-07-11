SUMMARY = "Documentation for texlive-quiz2socrative"
DESCRIPTION = "This package includes the documentation for texlive-quiz2socrative"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn52276"

RPM_NAME = "texlive-quiz2socrative-doc-2023.201.1.0svn52276-53.2.noarch.rpm"
RPM_HASH = "02a3900f02eca6aa916fffe615ea48c42b19631ff05432fe9bdbbedb8c5ca6055e1bbc632da76b2b10370cd051e5d53bcd33173ec983587fea85a2dd6e4c6a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-quiz2socrative-doc-it \
texlive-quiz2socrative-doc"

RDEPENDS:${PN} += ""

inherit rpm
