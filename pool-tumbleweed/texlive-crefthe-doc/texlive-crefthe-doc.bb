SUMMARY = "Documentation for texlive-crefthe"
DESCRIPTION = "This package includes the documentation for texlive-crefthe"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64498"

RPM_NAME = "texlive-crefthe-doc-2023.209.svn64498-55.1.noarch.rpm"
RPM_HASH = "461c14f756f9e321491021cde52cd8a7532d6d94c855eb80905eccb4d4a41455636aa1021cd66fff271c6c95aa142a3d7eb763cdbf2bf0837bf98859d9d90b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crefthe-doc"

RDEPENDS:${PN} += ""

inherit rpm
