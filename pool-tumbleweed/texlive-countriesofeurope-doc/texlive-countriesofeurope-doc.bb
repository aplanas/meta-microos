SUMMARY = "Documentation for texlive-countriesofeurope"
DESCRIPTION = "This package includes the documentation for texlive-countriesofeurope"
LICENSE = "OFL-1.1"

PV = "2023.204.0.0.23svn54512"

RPM_NAME = "texlive-countriesofeurope-doc-2023.204.0.0.23svn54512-54.1.noarch.rpm"
RPM_HASH = "8e1716132d80924efccf6f7fcb1b2769af492885f609d8be336a677c8bceb5741c697d5be2848c7d59db205d5aa5d271cab9e72bf1fff91de2ccf118a9424549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-countriesofeurope-doc"

RDEPENDS:${PN} += ""

inherit rpm
