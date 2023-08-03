SUMMARY = "Documentation for texlive-svn-multi"
DESCRIPTION = "This package includes the documentation for texlive-svn-multi"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4dsvn64967"

RPM_NAME = "texlive-svn-multi-doc-2023.209.2.4dsvn64967-58.1.noarch.rpm"
RPM_HASH = "39ae0630a2521858e515a79e410eaa2a80930a22fb64a2a55e1d93d36ff9e03b776b28e08e56da80976106d5029931a28b9a149ed564e4e1df08fcc7cb9e244d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-multi-doc"

RDEPENDS:${PN} += ""

inherit rpm
