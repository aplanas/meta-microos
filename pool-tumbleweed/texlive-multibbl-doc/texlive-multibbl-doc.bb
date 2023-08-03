SUMMARY = "Documentation for texlive-multibbl"
DESCRIPTION = "This package includes the documentation for texlive-multibbl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-multibbl-doc-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "d39b658ef91e33bb70090cdc68a0ba5230e8c54a84d6ec0b4a7460b6c8e5d2d1be7aff80714dc33fdad08f0f2b5b06020e723dcf4cec244e2a35bcd11724ed2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
