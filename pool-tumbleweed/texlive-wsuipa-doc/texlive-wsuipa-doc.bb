SUMMARY = "Documentation for texlive-wsuipa"
DESCRIPTION = "This package includes the documentation for texlive-wsuipa"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25469"

RPM_NAME = "texlive-wsuipa-doc-2023.201.svn25469-52.2.noarch.rpm"
RPM_HASH = "a128976392da3e906851dbb01ea47818c9168abd69fc994daf74b1737696a91e9f27b3c6dcffe23b066a52e27b4316659ab40410efbf7c16b1316722c6ca44f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsuipa-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
