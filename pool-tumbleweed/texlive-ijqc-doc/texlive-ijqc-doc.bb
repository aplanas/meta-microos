SUMMARY = "Documentation for texlive-ijqc"
DESCRIPTION = "This package includes the documentation for texlive-ijqc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-ijqc-doc-2023.209.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "cf6f6018cf6ba1841bcf4071644d50ed00d4011f5e57a4bf692687ea23dd9d33dcde52f9994acfe3186c8e461de517c7de5502c020c57917865baa3c6f0c339a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijqc-doc"

RDEPENDS:${PN} += ""

inherit rpm
