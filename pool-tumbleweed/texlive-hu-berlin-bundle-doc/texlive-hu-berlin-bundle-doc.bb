SUMMARY = "Documentation for texlive-hu-berlin-bundle"
DESCRIPTION = "This package includes the documentation for texlive-hu-berlin-bundle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn57580"

RPM_NAME = "texlive-hu-berlin-bundle-doc-2023.209.1.1.1svn57580-54.1.noarch.rpm"
RPM_HASH = "0194fd0276c290980c9b1e408e961a171cc60292e800108757f1af801b98d53d6befd7f3a89b854d6c5fd25e9f1db7535b97db7cba213cf5fd018d6d1aae2a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hu-berlin-bundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
