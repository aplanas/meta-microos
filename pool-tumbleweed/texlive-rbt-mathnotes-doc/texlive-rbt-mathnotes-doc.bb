SUMMARY = "Documentation for texlive-rbt-mathnotes"
DESCRIPTION = "This package includes the documentation for texlive-rbt-mathnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn61193"

RPM_NAME = "texlive-rbt-mathnotes-doc-2023.209.1.0.2svn61193-54.2.noarch.rpm"
RPM_HASH = "0c6959943a1b6883b96e54f87164d1b0c70b1c34922a0ae06aecca3ea589e761773f5762fb10ec5d3f8af86c4b418d9bc596c4e8d43dcf4d90e6e521933bd4fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rbt-mathnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
