SUMMARY = "Documentation for texlive-gckanbun"
DESCRIPTION = "This package includes the documentation for texlive-gckanbun"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61719"

RPM_NAME = "texlive-gckanbun-doc-2023.209.1.2svn61719-53.1.noarch.rpm"
RPM_HASH = "8e8605c64eadb112206a45ecaddac32eec23b390c0942cf95c77b6811ab27ee1a1f0dbf5d6ec74fe3a57fb2754bd427b1378c0e9df480cda8227b6cc7c76af22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gckanbun-doc"

RDEPENDS:${PN} += ""

inherit rpm
