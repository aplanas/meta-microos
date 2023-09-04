SUMMARY = "Documentation for texlive-interactiveworkbook"
DESCRIPTION = "This package includes the documentation for texlive-interactiveworkbook"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-interactiveworkbook-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "83d5032af245486d1bef72707cd359121675f9d47b782af9edd4ea60260e7d2b76124bb55c381b8c0586ec86c5fa742040dbc62db39cdabf8eebd4c237947bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interactiveworkbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
