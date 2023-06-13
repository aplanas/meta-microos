SUMMARY = "Documentation for texlive-envbig"
DESCRIPTION = "This package includes the documentation for texlive-envbig"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-envbig-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "72a541247ec44af3b9cfd3e59068b78e2584f4f376e76309576acc1b12a7b965316e9e7f32f7826d3cb7036220c8194057bb10b8e547453abe4902cd3176e613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envbig-doc"

RDEPENDS:${PN} += ""

inherit rpm
