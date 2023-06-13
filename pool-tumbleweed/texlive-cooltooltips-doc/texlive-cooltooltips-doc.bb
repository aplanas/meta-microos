SUMMARY = "Documentation for texlive-cooltooltips"
DESCRIPTION = "This package includes the documentation for texlive-cooltooltips"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn60201"

RPM_NAME = "texlive-cooltooltips-doc-2023.204.1.1svn60201-54.1.noarch.rpm"
RPM_HASH = "afbaa966c2d2bf7dd9c0841f728a6f6c33a79cae79600763d8998697bbc76c19d0cb3e67ead98e0f3d2036924180833d2b45af2a56dde246fd134ba8e89aaef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooltooltips-doc"

RDEPENDS:${PN} += ""

inherit rpm
