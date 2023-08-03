SUMMARY = "Documentation for texlive-cntformats"
DESCRIPTION = "This package includes the documentation for texlive-cntformats"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn34668"

RPM_NAME = "texlive-cntformats-doc-2023.209.0.0.7svn34668-54.1.noarch.rpm"
RPM_HASH = "8d220415f1fc48a819ed7a04d864c6a5ba47a90c3103ffb50561529a6ba0a22b8f6eb0d9cc07b7a2fee73bddf00c5db67b4532250e94d35bba86bedfaea879fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cntformats-doc"

RDEPENDS:${PN} += ""

inherit rpm
