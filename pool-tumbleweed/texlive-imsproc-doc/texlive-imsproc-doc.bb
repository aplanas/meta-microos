SUMMARY = "Documentation for texlive-imsproc"
DESCRIPTION = "This package includes the documentation for texlive-imsproc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-doc-2023.209.0.0.1svn29803-54.1.noarch.rpm"
RPM_HASH = "932813e8d081c7400dc7016396514bf0f56dcf41394c55393732941e3d89d64ae1a386c484aff74c83214ffbee58dea422fa6cb83206edfb399c00e40dbe2f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imsproc-doc"

RDEPENDS:${PN} += ""

inherit rpm
