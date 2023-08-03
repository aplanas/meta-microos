SUMMARY = "Documentation for texlive-boisik"
DESCRIPTION = "This package includes the documentation for texlive-boisik"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-boisik-doc-2023.209.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "5c5ec6b400d71600f78c955210088b71497d3053cd387c7ce60339262d90c037e330b33ad4b40150996383f0d7cff03404a2386bd0a9b3071bb39d939addb0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-boisik-doc-cs \
texlive-boisik-doc"

RDEPENDS:${PN} += ""

inherit rpm
