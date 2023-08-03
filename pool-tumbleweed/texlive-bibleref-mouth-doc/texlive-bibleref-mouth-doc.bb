SUMMARY = "Documentation for texlive-bibleref-mouth"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-mouth"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25527"

RPM_NAME = "texlive-bibleref-mouth-doc-2023.209.1.0svn25527-54.1.noarch.rpm"
RPM_HASH = "8d39990eeee9683afad184662cb513afc22c5e8cfde8c6e353445ceaec1b02f2aa1d38a64762c9f5f65369c11d3117d605656ce1557ee2cd82a5f6a823a17a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-mouth-doc"

RDEPENDS:${PN} += ""

inherit rpm
