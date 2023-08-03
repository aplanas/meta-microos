SUMMARY = "Documentation for texlive-navydocs"
DESCRIPTION = "This package includes the documentation for texlive-navydocs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn41643"

RPM_NAME = "texlive-navydocs-doc-2023.209.1.1svn41643-55.1.noarch.rpm"
RPM_HASH = "2a3aabbe18a1ffbdc965fe4443deb8ff5d3e4e4376296875333c037311f912e6704b0e169244eeae99361b244181b413f7f9b6cdc69ae343666afc75cc3e0d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-navydocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
