SUMMARY = "Documentation for texlive-resphilosophica"
DESCRIPTION = "This package includes the documentation for texlive-resphilosophica"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.35svn50935"

RPM_NAME = "texlive-resphilosophica-doc-2023.201.1.35svn50935-53.1.noarch.rpm"
RPM_HASH = "c2b1e108111017e76e36c70bb7f499d611bb5a43401015e1fb542602e6780722a0904b16f5ae5e2d578bd8f1261c16ac4ef939f0095f05a53eac5aec9ecdb102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resphilosophica-doc"
RDEPENDS:${PN} += ""

inherit rpm
