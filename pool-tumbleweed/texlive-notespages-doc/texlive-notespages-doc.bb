SUMMARY = "Documentation for texlive-notespages"
DESCRIPTION = "This package includes the documentation for texlive-notespages"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.1svn41906"

RPM_NAME = "texlive-notespages-doc-2023.209.0.0.8.1svn41906-55.1.noarch.rpm"
RPM_HASH = "e1697b8572966f0388bf2722dfd96da3fc619206b774baf7a81292ba7bcf67f02729dc5e1e0a4209c34ca139332b054197e919dfc88d0fb760a94c67748465d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notespages-doc"

RDEPENDS:${PN} += ""

inherit rpm
