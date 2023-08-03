SUMMARY = "Documentation for texlive-harpoon"
DESCRIPTION = "This package includes the documentation for texlive-harpoon"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn21327"

RPM_NAME = "texlive-harpoon-doc-2023.209.1.0svn21327-54.1.noarch.rpm"
RPM_HASH = "5b2d24de31a90b3afbeab8fba89fed4b1d5a4ffa3e87a88ff1be4e4a5ba4940e116d11a6763a565ab6f2043990290dc461ffdd24c9a9249aa8e71939412f573d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harpoon-doc"

RDEPENDS:${PN} += ""

inherit rpm
