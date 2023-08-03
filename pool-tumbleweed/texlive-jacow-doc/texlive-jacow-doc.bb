SUMMARY = "Documentation for texlive-jacow"
DESCRIPTION = "This package includes the documentation for texlive-jacow"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.7svn63060"

RPM_NAME = "texlive-jacow-doc-2023.209.2.7svn63060-56.1.noarch.rpm"
RPM_HASH = "3062fb241d9287a79af539af14e0320931378c0a4f7af71898a15b3619abbe60fbde808291020a38a63b65a7a72e8c141a796c3deaf1a7e994a2bb5de4b5d5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jacow-doc"

RDEPENDS:${PN} += ""

inherit rpm
