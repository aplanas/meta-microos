SUMMARY = "Documentation for texlive-synttree"
DESCRIPTION = "This package includes the documentation for texlive-synttree"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.2svn16252"

RPM_NAME = "texlive-synttree-doc-2023.209.1.4.2svn16252-58.1.noarch.rpm"
RPM_HASH = "29e8159fd577e113c6a51f8a5a6261f2ac88bc0ec49523a4b6bfd4fef87f7e39e4ea8e643d64fbd6f567dbed3859f5e0758704b14b50abdbf8d2ad0f61885e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-synttree-doc"

RDEPENDS:${PN} += ""

inherit rpm
