SUMMARY = "Documentation for texlive-errata"
DESCRIPTION = "This package includes the documentation for texlive-errata"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn42428"

RPM_NAME = "texlive-errata-doc-2023.209.0.0.3svn42428-54.2.noarch.rpm"
RPM_HASH = "9b61bd582172f1f1c2e8ca3a428d2dd3223b4c21af51c3bc4d095302aa7b184ec53e803633106ace2d411dfe62efa02b59048aa205b49555e032df0e25d88542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-errata-doc"

RDEPENDS:${PN} += ""

inherit rpm
