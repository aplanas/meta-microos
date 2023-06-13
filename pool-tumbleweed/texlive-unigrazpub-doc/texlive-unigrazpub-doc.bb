SUMMARY = "Documentation for texlive-unigrazpub"
DESCRIPTION = "This package includes the documentation for texlive-unigrazpub"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn64797"

RPM_NAME = "texlive-unigrazpub-doc-2023.201.1.00svn64797-53.1.noarch.rpm"
RPM_HASH = "b13bc49b07bac7e06042b435a3ac1b6d4d7e5ba114f410905d8c42047fcb2e92719224429f6a712d1e45a2f8b458246c57a16f3e79fc389eea0d7cd760787b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unigrazpub-doc"

RDEPENDS:${PN} += ""

inherit rpm
