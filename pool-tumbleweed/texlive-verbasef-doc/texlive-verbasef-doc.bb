SUMMARY = "Documentation for texlive-verbasef"
DESCRIPTION = "This package includes the documentation for texlive-verbasef"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn21922"

RPM_NAME = "texlive-verbasef-doc-2023.201.1.1svn21922-53.1.noarch.rpm"
RPM_HASH = "e74d42861950bc93d6a17e25102d378e6b0b3b6cc7d894b958441ea8378300a74f66f34337abe3975d02abb819352a6f0616303cf1ec9c521076cc1d8a4fad07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbasef-doc"

RDEPENDS:${PN} += ""

inherit rpm
