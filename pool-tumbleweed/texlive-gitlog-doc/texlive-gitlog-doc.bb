SUMMARY = "Documentation for texlive-gitlog"
DESCRIPTION = "This package includes the documentation for texlive-gitlog"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-doc-2023.201.0.0.0.betasvn38932-53.1.noarch.rpm"
RPM_HASH = "d0005e19cd8fb11e7db290c374fb44aaa280cbbe112a70725d2e329de492af5ffef27b3470e08a081c82eb2950279cfb559c3b4f2ccbe9ae5a3ec910133c313e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitlog-doc"

RDEPENDS:${PN} += ""

inherit rpm
