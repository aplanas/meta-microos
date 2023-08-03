SUMMARY = "Documentation for texlive-muling"
DESCRIPTION = "This package includes the documentation for texlive-muling"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-muling-doc-2023.209.0.0.3svn61719-55.1.noarch.rpm"
RPM_HASH = "3254c02cefb56d013bcc73d0dde44e84e51e34f0e6bcba7a57632289968fd5fc535abb5b606c1d4cc815569513d4cb4648ad7d2df809f02d9721e6b2287c12db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-muling-doc"

RDEPENDS:${PN} += ""

inherit rpm
