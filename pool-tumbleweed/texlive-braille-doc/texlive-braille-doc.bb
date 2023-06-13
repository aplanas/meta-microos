SUMMARY = "Documentation for texlive-braille"
DESCRIPTION = "This package includes the documentation for texlive-braille"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20655"

RPM_NAME = "texlive-braille-doc-2023.201.svn20655-52.1.noarch.rpm"
RPM_HASH = "385cf837395cb71e8a3a07c3c15903ebd0d011f56d714825430ae76f7b7157b1c5f597c6a7c23aa89916fcf1546a2b497a133a0f208168008959cf4fac186faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braille-doc"

RDEPENDS:${PN} += ""

inherit rpm
