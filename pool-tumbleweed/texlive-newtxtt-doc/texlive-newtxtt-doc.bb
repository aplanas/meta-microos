SUMMARY = "Documentation for texlive-newtxtt"
DESCRIPTION = "This package includes the documentation for texlive-newtxtt"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.056svn54512"

RPM_NAME = "texlive-newtxtt-doc-2023.201.1.056svn54512-54.1.noarch.rpm"
RPM_HASH = "61a9577734c820d8696d89ebd38fd74e3098a3124876cf0758ac03933815c0ebcd96fb995b4b1c65b1579c436171730fba2c1a588e1445b79372edc9eea98d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtxtt-doc"
RDEPENDS:${PN} += ""

inherit rpm
