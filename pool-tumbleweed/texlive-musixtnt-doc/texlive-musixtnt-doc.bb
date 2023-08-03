SUMMARY = "Documentation for texlive-musixtnt"
DESCRIPTION = "This package includes the documentation for texlive-musixtnt"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn40307"

RPM_NAME = "texlive-musixtnt-doc-2023.209.svn40307-55.1.noarch.rpm"
RPM_HASH = "14697d470b02f158f41e192c57edd4ddf3384f70e49cce2afc82109eabb715337b60c79cf7916032957cc75eaaf4bf3010de611055b4c48ebc23f2772a07e27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-msxlint.1 \
texlive-musixtnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
