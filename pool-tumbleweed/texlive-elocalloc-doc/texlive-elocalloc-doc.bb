SUMMARY = "Documentation for texlive-elocalloc"
DESCRIPTION = "This package includes the documentation for texlive-elocalloc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn42712"

RPM_NAME = "texlive-elocalloc-doc-2023.201.0.0.03svn42712-53.2.noarch.rpm"
RPM_HASH = "fc3d21a5164caff925bd0fdfa5e4adf43acef5d53859b8797661c5df6923e48fef59be9be25e96f907b5ce9eb96313b59dcfdfdb2ea9eeb2d1698dfd9a79b26e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elocalloc-doc"

RDEPENDS:${PN} += ""

inherit rpm
