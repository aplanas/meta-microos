SUMMARY = "Documentation for texlive-unigrazpub"
DESCRIPTION = "This package includes the documentation for texlive-unigrazpub"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn64797"

RPM_NAME = "texlive-unigrazpub-doc-2023.209.1.00svn64797-54.1.noarch.rpm"
RPM_HASH = "f5987ca0836f5f8eddc07b7bdd2d69201a15297fadd9a60d442f3a1fc3cd3543ce1655bd02c47d7cf7dea77d2ede52fff5093c17cc42afd1cfa8d2cffe28cb04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unigrazpub-doc"

RDEPENDS:${PN} += ""

inherit rpm
