SUMMARY = "Documentation for texlive-tikzducks"
DESCRIPTION = "This package includes the documentation for texlive-tikzducks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn55713"

RPM_NAME = "texlive-tikzducks-doc-2023.201.1.5svn55713-52.1.noarch.rpm"
RPM_HASH = "4b40f4d2bd67e0b1e7f00478b8b0ea9854e2a68685207e0a9c334fbeba0bafac13329f69d912725a63c96ddcf86a95fbe538e7902c292165a223138bd7192ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzducks-doc"

RDEPENDS:${PN} += ""

inherit rpm
