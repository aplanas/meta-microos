SUMMARY = "Documentation for texlive-placeat"
DESCRIPTION = "This package includes the documentation for texlive-placeat"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1d1svn45145"

RPM_NAME = "texlive-placeat-doc-2023.209.0.0.1d1svn45145-52.1.noarch.rpm"
RPM_HASH = "b2b0024cfb92b990b1af3e8d5243414144f581fd825b313aa9bab01bcd140b81a8f4f2d74b32decdb70e9d05b98fcdc8ee29f8739e5ae7c7b456a24f78a1c81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-placeat-doc"

RDEPENDS:${PN} += ""

inherit rpm
