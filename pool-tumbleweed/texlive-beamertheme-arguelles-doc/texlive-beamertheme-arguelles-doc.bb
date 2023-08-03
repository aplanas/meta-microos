SUMMARY = "Documentation for texlive-beamertheme-arguelles"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-arguelles"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn66358"

RPM_NAME = "texlive-beamertheme-arguelles-doc-2023.209.2.1.0svn66358-54.1.noarch.rpm"
RPM_HASH = "8c18c08f76e26a3140cc7550d490a2b504ada68810a5d4eafa4855611306e54779962db7001452fd0f77b2f5c9c210b7dd8fdbdd868cde399152a1d5c85552ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-arguelles-doc"

RDEPENDS:${PN} += ""

inherit rpm
