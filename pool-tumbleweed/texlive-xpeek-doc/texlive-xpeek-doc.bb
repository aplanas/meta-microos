SUMMARY = "Documentation for texlive-xpeek"
DESCRIPTION = "This package includes the documentation for texlive-xpeek"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-doc-2023.201.0.0.2svn61719-52.2.noarch.rpm"
RPM_HASH = "1f87f7c1eba259b4b2f68c6f2b6f6bdb47acd3b3fcae2a2f88ac1abce2e4b04e68040a77f17d2f38bf1a69af7ca59e74795a65c4c15a0c5f73eb5add5fc44c02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpeek-doc"

RDEPENDS:${PN} += ""

inherit rpm
