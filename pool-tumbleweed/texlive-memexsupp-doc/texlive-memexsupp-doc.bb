SUMMARY = "Documentation for texlive-memexsupp"
DESCRIPTION = "This package includes the documentation for texlive-memexsupp"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn15878"

RPM_NAME = "texlive-memexsupp-doc-2023.208.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "d25a6871a606cb645bef30f3b13904a367f9e6307635110d42b3185ef266606f1a1ebca3d0f356605c3a533c450ddda0fffe75891791048fe1539089e36c8515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memexsupp-doc"

RDEPENDS:${PN} += ""

inherit rpm
