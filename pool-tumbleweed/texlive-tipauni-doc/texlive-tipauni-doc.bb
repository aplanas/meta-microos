SUMMARY = "Documentation for texlive-tipauni"
DESCRIPTION = "This package includes the documentation for texlive-tipauni"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.7asvn65817"

RPM_NAME = "texlive-tipauni-doc-2023.209.0.0.7asvn65817-53.1.noarch.rpm"
RPM_HASH = "93d1876faef6edf33d3c10a83d0c6938207f240c0d349aeed40810a5b9cc7bd2ad79e924b4be59cf71220a0fe158cc5c90faf68c5650321aa6be12ee1f3267b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tipauni-doc"

RDEPENDS:${PN} += ""

inherit rpm
