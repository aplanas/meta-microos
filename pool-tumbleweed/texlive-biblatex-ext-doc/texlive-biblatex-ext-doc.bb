SUMMARY = "Documentation for texlive-biblatex-ext"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ext"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.16svn63638"

RPM_NAME = "texlive-biblatex-ext-doc-2023.209.0.0.16svn63638-54.1.noarch.rpm"
RPM_HASH = "452067944e33412655167c561c49e994103036ef1a4eb1b3eb0a80017b3017273eebadbf37a229f8defdb21b57dabb96422f7ac06726eec0c1c72018c5a93ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ext-doc"

RDEPENDS:${PN} += ""

inherit rpm
