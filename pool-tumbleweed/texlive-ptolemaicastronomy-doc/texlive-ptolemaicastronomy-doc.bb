SUMMARY = "Documentation for texlive-ptolemaicastronomy"
DESCRIPTION = "This package includes the documentation for texlive-ptolemaicastronomy"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-doc-2023.209.1.0svn50810-54.1.noarch.rpm"
RPM_HASH = "b0b6e4c8430e1fb9e745ad50a07ecd90c18887ba9f58b4a87206dbf976445b1a5ccb4d96fe0429e2df4067a2ff51583cf7c831aee0fd7ecf6b57bf2110bfc705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptolemaicastronomy-doc"

RDEPENDS:${PN} += ""

inherit rpm
