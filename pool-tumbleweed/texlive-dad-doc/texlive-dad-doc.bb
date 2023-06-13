SUMMARY = "Documentation for texlive-dad"
DESCRIPTION = "This package includes the documentation for texlive-dad"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2svn54191"

RPM_NAME = "texlive-dad-doc-2023.204.1.2svn54191-54.1.noarch.rpm"
RPM_HASH = "dd19e3b523d96ebaf93709dd4d4f7eeb1dd812cf08e0a8fe090ee8dc38df3436ebddd6e9b202a81feacbc945a6ee6634f940a1f6539feb7028c4fd6d4413f47b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dad-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
