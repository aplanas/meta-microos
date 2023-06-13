SUMMARY = "Documentation for texlive-webquiz"
DESCRIPTION = "This package includes the documentation for texlive-webquiz"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.5.2svn58808"

RPM_NAME = "texlive-webquiz-doc-2023.201.5.2svn58808-53.1.noarch.rpm"
RPM_HASH = "0d9e76ca221c1a6e29bf440856399797a550d8e8beddf464bd9af643650d593bb4b912bf8129bc0929581b330103f347352601e48f77b16a2d23bd5440293a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(webquiz.1) \
texlive-webquiz-doc"

RDEPENDS:${PN} += ""

inherit rpm
