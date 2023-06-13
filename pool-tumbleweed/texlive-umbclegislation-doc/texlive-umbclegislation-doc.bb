SUMMARY = "Documentation for texlive-umbclegislation"
DESCRIPTION = "This package includes the documentation for texlive-umbclegislation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2016_6_8svn41348"

RPM_NAME = "texlive-umbclegislation-doc-2023.201.2016_6_8svn41348-53.1.noarch.rpm"
RPM_HASH = "7504e458ad53b394f95b8b19322e05740646c3daa72ff972a8e44dbf51ad2b8c09c2c830ce0739d1b7661e1544ca0554834d21c624570b834c289f050f1a02a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umbclegislation-doc"

RDEPENDS:${PN} += ""

inherit rpm
