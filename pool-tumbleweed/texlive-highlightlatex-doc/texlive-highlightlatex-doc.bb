SUMMARY = "Documentation for texlive-highlightlatex"
DESCRIPTION = "This package includes the documentation for texlive-highlightlatex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58392"

RPM_NAME = "texlive-highlightlatex-doc-2023.201.svn58392-53.1.noarch.rpm"
RPM_HASH = "38b0fec08d93d01fd6803b5a92cb51a4ddf6f0de3500b3cf280cb8b4c5c5212f76d1438bf4c3c6944b5e91046d41bc5dfe25eea2485900445c3b3095b82429fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-highlightlatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
