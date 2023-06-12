SUMMARY = "Documentation for texlive-philex"
DESCRIPTION = "This package includes the documentation for texlive-philex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn36396"

RPM_NAME = "texlive-philex-doc-2023.201.1.3svn36396-51.1.noarch.rpm"
RPM_HASH = "02f26bde86649c3f829aa7ad524608ddd262d9823f0eac46c99b7260d7733ceffe9887225d04a8df3ab8751596c974f8b5e3066d326d279e2a72d1a7f99100b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philex-doc"
RDEPENDS:${PN} += ""

inherit rpm
