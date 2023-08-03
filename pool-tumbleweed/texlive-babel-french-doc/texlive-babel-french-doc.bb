SUMMARY = "Documentation for texlive-babel-french"
DESCRIPTION = "This package includes the documentation for texlive-babel-french"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5qsvn66513"

RPM_NAME = "texlive-babel-french-doc-2023.209.3.5qsvn66513-54.1.noarch.rpm"
RPM_HASH = "656a263484ab4d4a16f3abec4eed3681a2f9f3bb7d7a819f9e9332adfe3ded7d3cd27d83fa45fd1a2a6b2a7671be9c34d2d45b0a9f5bfd710aa99f6777f14a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-babel-french-doc-fr \
texlive-babel-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
