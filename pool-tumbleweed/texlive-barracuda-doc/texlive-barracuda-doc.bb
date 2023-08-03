SUMMARY = "Documentation for texlive-barracuda"
DESCRIPTION = "This package includes the documentation for texlive-barracuda"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.0.12svn63708"

RPM_NAME = "texlive-barracuda-doc-2023.209.0.0.0.12svn63708-54.1.noarch.rpm"
RPM_HASH = "29eeb3007b11cf9cc1e9898ece4e3062c4dc8d6161cac7c9fc375cb5d27e0cf4ca082d0a6f939998e14c119837af8dc8022e61002a21a18984e337fc021e0896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barracuda-doc"

RDEPENDS:${PN} += ""

inherit rpm
