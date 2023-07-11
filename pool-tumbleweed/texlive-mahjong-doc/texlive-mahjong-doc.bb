SUMMARY = "Documentation for texlive-mahjong"
DESCRIPTION = "This package includes the documentation for texlive-mahjong"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.1svn58896"

RPM_NAME = "texlive-mahjong-doc-2023.208.1.0.1svn58896-53.1.noarch.rpm"
RPM_HASH = "4362afaf2d1293f526832687886ce4ece3dc9f05afa501ada5c0bb827ce7ebd2ce7e7863eef4c053e55cbd8bead738542d22a5e3c4c1bb588e9e9bfd4d986a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mahjong-doc"

RDEPENDS:${PN} += ""

inherit rpm
