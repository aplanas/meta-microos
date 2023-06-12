SUMMARY = "Documentation for texlive-beamertheme-light"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-light"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn49867"

RPM_NAME = "texlive-beamertheme-light-doc-2023.201.1.0svn49867-53.1.noarch.rpm"
RPM_HASH = "cd30bcc7ea2b5771a9d48a1351b4d3ebf61487a0c20b581131ecf84d7640386c85e052153a47bf20db99cf9092bac59404ddfd96f812f2f582d0131be8e08bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-light-doc"
RDEPENDS:${PN} += ""

inherit rpm
