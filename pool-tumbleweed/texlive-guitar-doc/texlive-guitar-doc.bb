SUMMARY = "Documentation for texlive-guitar"
DESCRIPTION = "This package includes the documentation for texlive-guitar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn32258"

RPM_NAME = "texlive-guitar-doc-2023.209.1.6svn32258-54.1.noarch.rpm"
RPM_HASH = "030995f6cd87a96ed8d2ac7596459eb98522f9dd4a364533f5cb9f243c3f397d54a9005f1069d01c74890c23b1eb8fda04f83aa9b325238587dc365036b8da12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitar-doc"

RDEPENDS:${PN} += ""

inherit rpm
