SUMMARY = "Documentation for texlive-droid"
DESCRIPTION = "This package includes the documentation for texlive-droid"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn54512"

RPM_NAME = "texlive-droid-doc-2023.201.3.2svn54512-52.1.noarch.rpm"
RPM_HASH = "8ead8919795068a8df028528ff300239619c1d257f9d11fa3b90ea1926bcafe3c1d2c9b67460d5f03ef4cf06aa16c04afb2a3f5d19b0883d1e732e74b2742c47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-droid-doc"
RDEPENDS:${PN} += ""

inherit rpm
