SUMMARY = "Documentation for texlive-cmtiup"
DESCRIPTION = "This package includes the documentation for texlive-cmtiup"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn39728"

RPM_NAME = "texlive-cmtiup-doc-2023.209.2.1svn39728-54.1.noarch.rpm"
RPM_HASH = "36973e458930fb44dad6873e7d984b21d96f1bba5072f643eabe80532aa074f82b60454801712e79f885e1dd4e39e8e129eaa5d9e6f146c39c885efba2247cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmtiup-doc"

RDEPENDS:${PN} += ""

inherit rpm
