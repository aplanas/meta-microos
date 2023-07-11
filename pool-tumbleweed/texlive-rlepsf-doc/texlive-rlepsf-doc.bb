SUMMARY = "Documentation for texlive-rlepsf"
DESCRIPTION = "This package includes the documentation for texlive-rlepsf"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19082"

RPM_NAME = "texlive-rlepsf-doc-2023.201.svn19082-53.2.noarch.rpm"
RPM_HASH = "03e6299f50170f82cb5f1e6532d411118fa0920537ef163f021a5e29632a0f5bbfdc4d777ed326e92444b0e1477ca4ebc70c61c9a1f73755a45ba392d92a69bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rlepsf-doc"

RDEPENDS:${PN} += ""

inherit rpm
