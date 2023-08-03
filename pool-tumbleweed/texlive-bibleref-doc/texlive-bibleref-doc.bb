SUMMARY = "Documentation for texlive-bibleref"
DESCRIPTION = "This package includes the documentation for texlive-bibleref"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.25svn55626"

RPM_NAME = "texlive-bibleref-doc-2023.209.1.25svn55626-54.1.noarch.rpm"
RPM_HASH = "2e9d8a9045e7af63ed1cf5d68a38f0c33078c274d236206fcb225ac066170251f1cc05d2f059a67cdd4793ad0c13f9df2bf7b109dbffad0c9d010757ca37ca42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-doc"

RDEPENDS:${PN} += ""

inherit rpm
