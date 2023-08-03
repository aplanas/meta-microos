SUMMARY = "Documentation for texlive-pagecont"
DESCRIPTION = "This package includes the documentation for texlive-pagecont"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pagecont-doc-2023.209.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "c3c20f329057e50f39f826f0caff1ee10376e5b53b3896d97759f94565ae79e7b9e44c0efc355b7847b0fd1dde6f7767736b909169d0885391be7bb4f787bd13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagecont-doc"

RDEPENDS:${PN} += ""

inherit rpm
