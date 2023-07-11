SUMMARY = "Documentation for texlive-zhlineskip"
DESCRIPTION = "This package includes the documentation for texlive-zhlineskip"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-doc-2023.201.1.0esvn51142-52.2.noarch.rpm"
RPM_HASH = "a0ab9286ddca977929fb2ac373385cadaf26271afa5822006e4d444c27aaf33343079177297a389828238de1e52dd1434cb24bbd26637725b9265c4e1a301467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlineskip-doc-zh \
texlive-zhlineskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
