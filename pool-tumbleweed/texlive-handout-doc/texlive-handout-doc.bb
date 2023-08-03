SUMMARY = "Documentation for texlive-handout"
DESCRIPTION = "This package includes the documentation for texlive-handout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.0svn43962"

RPM_NAME = "texlive-handout-doc-2023.209.1.6.0svn43962-54.1.noarch.rpm"
RPM_HASH = "04025e01f8fe9c79a6b0597ba658232d0a6a9791b95f0a6cf8fbd0ef397e23e438053743bf28092e0bc50028547b8862965c188a06cd39efc4dee16d45d8a0f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handout-doc"

RDEPENDS:${PN} += ""

inherit rpm
