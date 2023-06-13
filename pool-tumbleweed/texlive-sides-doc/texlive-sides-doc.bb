SUMMARY = "Documentation for texlive-sides"
DESCRIPTION = "This package includes the documentation for texlive-sides"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-sides-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "e21f7fcc76a85d7719aa4f0207d7c8a38c7d9ba2777097f55b8919a27aad317cacb3e3ca50ceeb15c8e15e496243278d542474a2b8d19da403c2967c8d59be08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sides-doc"

RDEPENDS:${PN} += ""

inherit rpm
