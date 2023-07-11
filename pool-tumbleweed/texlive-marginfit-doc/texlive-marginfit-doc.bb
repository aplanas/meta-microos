SUMMARY = "Documentation for texlive-marginfit"
DESCRIPTION = "This package includes the documentation for texlive-marginfit"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn48281"

RPM_NAME = "texlive-marginfit-doc-2023.208.1.1svn48281-53.1.noarch.rpm"
RPM_HASH = "a93ef6b534a2f80f05f374861cad3da850bb56edd1f37cadb2bc9119e20c4375c25107bea65c131925b8719bae92a4cec2d26b369a55ae76cfec4a41f75b9982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginfit-doc"

RDEPENDS:${PN} += ""

inherit rpm
