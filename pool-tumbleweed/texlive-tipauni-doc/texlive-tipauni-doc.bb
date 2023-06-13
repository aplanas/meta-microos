SUMMARY = "Documentation for texlive-tipauni"
DESCRIPTION = "This package includes the documentation for texlive-tipauni"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7asvn65817"

RPM_NAME = "texlive-tipauni-doc-2023.201.0.0.7asvn65817-52.1.noarch.rpm"
RPM_HASH = "c79e16f933b83a0df10cb89e4461040cedfcd6f34a17e7fdd9d8151d1d4b81429a17f6e3324831911b12051a90074559b1367e5523752f14a773613cf0fef9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tipauni-doc"

RDEPENDS:${PN} += ""

inherit rpm
