SUMMARY = "Documentation for texlive-endfloat"
DESCRIPTION = "This package includes the documentation for texlive-endfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.7svn57090"

RPM_NAME = "texlive-endfloat-doc-2023.201.2.7svn57090-53.2.noarch.rpm"
RPM_HASH = "ea0fd1d9bbe081dc677a98c9d359a8b68848e9b67da28dc41a0ac141a0c1ced7416473925bf9407bdccc1fae622ff25101a43c582ff07e5ab92872af5ea1e181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
