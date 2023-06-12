SUMMARY = "Documentation for texlive-arphic-ttf"
DESCRIPTION = "This package includes the documentation for texlive-arphic-ttf"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42675"

RPM_NAME = "texlive-arphic-ttf-doc-2023.201.svn42675-53.1.noarch.rpm"
RPM_HASH = "167ea879e1288102cae4e40b4068fa2f90c70e251d19dffc64714bf4bf6ad8e6c4ce87f3e9cc28f18ac863696075351afd50d7abf84a99048151b24f1753f75d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-ttf-doc"
RDEPENDS:${PN} += ""

inherit rpm
