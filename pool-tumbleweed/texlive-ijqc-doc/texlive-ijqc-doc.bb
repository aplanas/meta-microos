SUMMARY = "Documentation for texlive-ijqc"
DESCRIPTION = "This package includes the documentation for texlive-ijqc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-ijqc-doc-2023.201.1.2svn15878-52.1.noarch.rpm"
RPM_HASH = "4d248c1a19ff2226195d7973cc7c9e535c824d1c3bfb5b23826161a27f035ee3855497fd09f2be494d143c548399af9373337261a7019f8d2f2235e3295072cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijqc-doc"

RDEPENDS:${PN} += ""

inherit rpm
