SUMMARY = "Documentation for texlive-wallpaper"
DESCRIPTION = "This package includes the documentation for texlive-wallpaper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn15878"

RPM_NAME = "texlive-wallpaper-doc-2023.209.1.10svn15878-54.1.noarch.rpm"
RPM_HASH = "fd31dee64af3cc6fd63d804b057f322de2b4ab3b667bf61dd79a54787d81f1405889fcb65f2e9e836eecddb91b66179c562844be655495fb5248c2b0f3e2c4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wallpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
