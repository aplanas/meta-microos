SUMMARY = "Documentation for texlive-blox"
DESCRIPTION = "This package includes the documentation for texlive-blox"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.51svn57949"

RPM_NAME = "texlive-blox-doc-2023.209.2.51svn57949-53.1.noarch.rpm"
RPM_HASH = "d29f21d8e31de7bf7209c887b861a692c62ae13e33b7bbfbffd097240763a98ed1355a9d2577c48440667edf29fa5cbc22dddf57a5d9394cacf556ab8bf4b834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blox-doc"

RDEPENDS:${PN} += ""

inherit rpm
