SUMMARY = "Documentation for texlive-engrec"
DESCRIPTION = "This package includes the documentation for texlive-engrec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-engrec-doc-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "38182e13c78b78b73936afe1d8342d20b232cb5f8e2b2f87bfb8a26adb598f71a086423d6d1166d2ce329bad74c6157195d0ee8a6336083c293ca93fb06f9b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-engrec-doc"

RDEPENDS:${PN} += ""

inherit rpm
