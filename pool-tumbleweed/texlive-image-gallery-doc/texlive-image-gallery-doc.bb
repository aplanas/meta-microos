SUMMARY = "Documentation for texlive-image-gallery"
DESCRIPTION = "This package includes the documentation for texlive-image-gallery"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-doc-2023.201.1.0jsvn15878-52.1.noarch.rpm"
RPM_HASH = "8a00397451a1dbaa1288ea64f3c0e0c44158fb98da713078d99b24757a2393808ba285d68aff62b4421663a5f3aefe15d7d149b8cf9a586260c7a3ff672ce4d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-image-gallery-doc"

RDEPENDS:${PN} += ""

inherit rpm
