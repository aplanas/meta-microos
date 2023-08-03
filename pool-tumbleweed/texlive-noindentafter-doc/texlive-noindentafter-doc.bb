SUMMARY = "Documentation for texlive-noindentafter"
DESCRIPTION = "This package includes the documentation for texlive-noindentafter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn59195"

RPM_NAME = "texlive-noindentafter-doc-2023.209.1.00svn59195-55.1.noarch.rpm"
RPM_HASH = "05f2a20732cb37f2f292ad4e88816e14003ec0826c98069589e08cc7b6a80721b0551065fcca73cb48dbf0364e8e84915e7d82070c4b900b67ff043d16259f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noindentafter-doc"

RDEPENDS:${PN} += ""

inherit rpm
