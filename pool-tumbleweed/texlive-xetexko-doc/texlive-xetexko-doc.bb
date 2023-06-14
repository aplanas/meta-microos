SUMMARY = "Documentation for texlive-xetexko"
DESCRIPTION = "This package includes the documentation for texlive-xetexko"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn64894"

RPM_NAME = "texlive-xetexko-doc-2023.201.4.2svn64894-52.1.noarch.rpm"
RPM_HASH = "9ff4374fde1c0c5d4af614c69b595f1b16521cc4bbe764c20ad544e4f0b181c245c5aed2b1a3312e2052a22495bb8b59bc9bdf1a89b966e1f26037ead00b7d5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xetexko-doc-ko \
texlive-xetexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
