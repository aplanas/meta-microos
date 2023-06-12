SUMMARY = "Documentation for texlive-screenplay"
DESCRIPTION = "This package includes the documentation for texlive-screenplay"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn27223"

RPM_NAME = "texlive-screenplay-doc-2023.201.1.6svn27223-53.1.noarch.rpm"
RPM_HASH = "2cabb40fc1cd0f0e5a5f0df0fd865eea03332e0f00aff17d1d737d4017001097b2aef6127630e25de1f7e2579dd015c2a16cf9aa51f0139ba04129b017d450a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-screenplay-doc"
RDEPENDS:${PN} += ""

inherit rpm
