SUMMARY = "Documentation for texlive-bitter"
DESCRIPTION = "This package includes the documentation for texlive-bitter"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64541"

RPM_NAME = "texlive-bitter-doc-2023.209.svn64541-53.1.noarch.rpm"
RPM_HASH = "c074ba66a67f7613cfc039490c808a20ca387a91de817a4384aa1e79921a717286117f98863858e1b82494ad9bf0a81bd104046bf723148f36288c4f28690a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitter-doc"

RDEPENDS:${PN} += ""

inherit rpm
