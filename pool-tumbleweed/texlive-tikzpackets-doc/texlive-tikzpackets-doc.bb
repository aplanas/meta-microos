SUMMARY = "Documentation for texlive-tikzpackets"
DESCRIPTION = "This package includes the documentation for texlive-tikzpackets"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55827"

RPM_NAME = "texlive-tikzpackets-doc-2023.201.1.0svn55827-52.1.noarch.rpm"
RPM_HASH = "01c0c2cb9772528202dc020e5c7bf8e143cfb72e191893590ae9fcaae85c2c794230c819d7cde762d6b49d72f7ebdb994c9153a85fc9a37c45a13fcddd95c3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpackets-doc"

RDEPENDS:${PN} += ""

inherit rpm
