SUMMARY = "Documentation for texlive-biblatex-realauthor"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-realauthor"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7.1asvn45865"

RPM_NAME = "texlive-biblatex-realauthor-doc-2023.201.2.7.1asvn45865-53.1.noarch.rpm"
RPM_HASH = "d3b59030469e3c1a66c0f81f379e6289da1ada32647e708e8c5e57e7f161a9fcccd8a6154d2b5fee122c0aff8b0db81503ac93b645a0121bf7d3bab688f8e9d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-realauthor-doc"

RDEPENDS:${PN} += ""

inherit rpm
