SUMMARY = "Documentation for texlive-harvard"
DESCRIPTION = "This package includes the documentation for texlive-harvard"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.5svn15878"

RPM_NAME = "texlive-harvard-doc-2023.201.2.0.5svn15878-53.2.noarch.rpm"
RPM_HASH = "e8d76b6d29a314b5e133189102a21bd64bb755805c4e6407e437c3cf6e1365d7dd706da2b6b3b6ec8652ad41f273d3400a1235a6a1f40e3da7ea460c3fbae1ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harvard-doc"

RDEPENDS:${PN} += ""

inherit rpm
