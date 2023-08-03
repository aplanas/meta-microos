SUMMARY = "Documentation for texlive-context-simpleslides"
DESCRIPTION = "This package includes the documentation for texlive-context-simpleslides"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn63903"

RPM_NAME = "texlive-context-simpleslides-doc-2023.209.svn63903-55.1.noarch.rpm"
RPM_HASH = "d00cb48d6ac68198ad066779a82535840d06bf22eb5bede38c2cb7027362d9919902ca9da0da8b4e5f323e1fb1d831941220ada71ebc8d7e91b14e0d5bc4a4da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-simpleslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
