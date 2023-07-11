SUMMARY = "Documentation for texlive-hulipsum"
DESCRIPTION = "This package includes the documentation for texlive-hulipsum"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn56848"

RPM_NAME = "texlive-hulipsum-doc-2023.208.1.1svn56848-53.1.noarch.rpm"
RPM_HASH = "67eff074c1988842094d6209ff685d81ee6dbe35a32a1f857979722cdc77b627e44d82d92aeb4576e6c483d85885a3fb2c8e706fea662acc3a5f4a80e04b1016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hulipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
