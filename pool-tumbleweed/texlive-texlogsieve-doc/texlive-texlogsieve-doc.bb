SUMMARY = "Documentation for texlive-texlogsieve"
DESCRIPTION = "This package includes the documentation for texlive-texlogsieve"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3.1svn64301"

RPM_NAME = "texlive-texlogsieve-doc-2023.209.1.3.1svn64301-55.1.noarch.rpm"
RPM_HASH = "903cc743155286c724956d99a51be0463e83bd75af85f6da881efaf20a8fb3a2f23ebbee65ad897e10bc8aed9a7d27bbf4f1deca7fc9dbb7f472af064de41f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texlogsieve.1 \
texlive-texlogsieve-doc"

RDEPENDS:${PN} += ""

inherit rpm
