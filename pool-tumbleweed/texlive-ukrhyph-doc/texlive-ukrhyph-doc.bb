SUMMARY = "Documentation for texlive-ukrhyph"
DESCRIPTION = "This package includes the documentation for texlive-ukrhyph"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21081"

RPM_NAME = "texlive-ukrhyph-doc-2023.209.svn21081-54.1.noarch.rpm"
RPM_HASH = "9ebb2d029ed9598b36a07b14efe0de8de081d85126d3d41c81dcaa3873f0c4c9b16b6211e40d9acd90ddc9a5c05d97cb5c3719c234d4676155e33734e7db0381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ukrhyph-doc-en-GB \
texlive-ukrhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm
