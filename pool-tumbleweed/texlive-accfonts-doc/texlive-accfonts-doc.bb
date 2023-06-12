SUMMARY = "Documentation for texlive-accfonts"
DESCRIPTION = "This package includes the documentation for texlive-accfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.25svn18835"

RPM_NAME = "texlive-accfonts-doc-2023.201.0.0.25svn18835-54.1.noarch.rpm"
RPM_HASH = "62d4539b049c62a2d29658c6af596c52d944a465cd0ef8f5cf00ca325baac67242e4e9225e43911b165010d9ab5bc3d6bb2b04bdbb5cf6ca1e5c12fbb06a5fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accfonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
