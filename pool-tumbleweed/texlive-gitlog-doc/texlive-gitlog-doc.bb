SUMMARY = "Documentation for texlive-gitlog"
DESCRIPTION = "This package includes the documentation for texlive-gitlog"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-doc-2023.209.0.0.0.betasvn38932-54.2.noarch.rpm"
RPM_HASH = "3e6dba1270e031e3e54e5b30471831925337108c4d61fbcf4ff717a416b5ddb3e3bfe0fc4308afd309118b80652fec851b6a9902c18b91602928f265dbdf3261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitlog-doc"

RDEPENDS:${PN} += ""

inherit rpm
