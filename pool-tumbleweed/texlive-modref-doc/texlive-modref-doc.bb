SUMMARY = "Documentation for texlive-modref"
DESCRIPTION = "This package includes the documentation for texlive-modref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-modref-doc-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "033b0fc5cf9dabe70a64f4166521dba97803e6e2dd36e27c1aa1f091ec4edded160696a78100b70f26d66d38e03343fde76d28381136f63a18888e272b99ec8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modref-doc"

RDEPENDS:${PN} += ""

inherit rpm
