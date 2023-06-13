SUMMARY = "Documentation for texlive-sankey"
DESCRIPTION = "This package includes the documentation for texlive-sankey"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn61874"

RPM_NAME = "texlive-sankey-doc-2023.201.3.0.1svn61874-53.1.noarch.rpm"
RPM_HASH = "8989da806da8fb2087ce4df1b3a9bc6cbd57f7782741c42e0f0c81d32084990ead79d7c0fc97c23366b8fc57c3c0542d6c731e8f9e164bdbf54825b1d7774abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sankey-doc"

RDEPENDS:${PN} += ""

inherit rpm
