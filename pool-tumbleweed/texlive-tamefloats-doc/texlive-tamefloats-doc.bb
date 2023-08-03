SUMMARY = "Documentation for texlive-tamefloats"
DESCRIPTION = "This package includes the documentation for texlive-tamefloats"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.42svn27345"

RPM_NAME = "texlive-tamefloats-doc-2023.209.0.0.42svn27345-55.1.noarch.rpm"
RPM_HASH = "13fb09a2cc152ec587d1ae7fb8ce84a972bf214ffa3d375924e4b4ab8e5465b10a4bc520fe6b17f8115f0fcd862e2d932ef432162c04642e223bed39f48182ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tamefloats-doc"

RDEPENDS:${PN} += ""

inherit rpm
