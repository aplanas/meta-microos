SUMMARY = "Documentation for texlive-swfigure"
DESCRIPTION = "This package includes the documentation for texlive-swfigure"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.20svn63255"

RPM_NAME = "texlive-swfigure-doc-2023.209.0.0.9.20svn63255-58.1.noarch.rpm"
RPM_HASH = "45f4f7808a4ee6776dea8f7cab8266130d8b76d7ca1a96ec78eb6f552f80fa544d32f975de6a3e69fd4194a87a66f9598a7c90a3374de8254408deb5b022bb2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
