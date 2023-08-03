SUMMARY = "Documentation for texlive-wrapfig2"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig2"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1.1svn66115"

RPM_NAME = "texlive-wrapfig2-doc-2023.209.6.1.1svn66115-53.1.noarch.rpm"
RPM_HASH = "0bf524c2471bbd5b1d4533e84394b57fd9aa514e39674d528de05d8717d7abaa41fb2707318515a57a84c6aca2f2917ecf94a540bfc2cf8ca6b12a45c6f602c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig2-doc"

RDEPENDS:${PN} += ""

inherit rpm
