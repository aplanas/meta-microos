SUMMARY = "Documentation for texlive-morewrites"
DESCRIPTION = "This package includes the documentation for texlive-morewrites"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49531"

RPM_NAME = "texlive-morewrites-doc-2023.201.svn49531-54.1.noarch.rpm"
RPM_HASH = "c48a38f96f95874ad1f16a06cd50ff9c4371421e887bf159ea901b1f66c5bb4e676776d3d741ecc222aba57af1bf6f3244df33eb7711dc2db8fb9ee3a088cc79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-morewrites-doc"
RDEPENDS:${PN} += ""

inherit rpm
