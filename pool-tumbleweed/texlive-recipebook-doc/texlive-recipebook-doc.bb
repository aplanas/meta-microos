SUMMARY = "Documentation for texlive-recipebook"
DESCRIPTION = "This package includes the documentation for texlive-recipebook"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn37026"

RPM_NAME = "texlive-recipebook-doc-2023.209.svn37026-54.2.noarch.rpm"
RPM_HASH = "b539ace85458798a25ed371442eb5b2f18e6c600505abc19f9342612aeb296832175c6e57aa34d441fa537fffff27cd191c3ee94b2912371f6af1a71f0e4d75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
