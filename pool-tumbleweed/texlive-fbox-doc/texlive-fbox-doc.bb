SUMMARY = "Documentation for texlive-fbox"
DESCRIPTION = "This package includes the documentation for texlive-fbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.06svn62126"

RPM_NAME = "texlive-fbox-doc-2023.209.0.0.06svn62126-53.1.noarch.rpm"
RPM_HASH = "f06dff66893c370aff752ae36cda34fbb712a16269ca7b251ddc9ba76b60b218326427aa5566ee8a4ff2b272bdd815a4a7d59a0a7e9912ec82f0404165604bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
