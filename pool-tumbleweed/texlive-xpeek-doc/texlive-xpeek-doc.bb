SUMMARY = "Documentation for texlive-xpeek"
DESCRIPTION = "This package includes the documentation for texlive-xpeek"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-doc-2023.209.0.0.2svn61719-53.1.noarch.rpm"
RPM_HASH = "924d1e3e17404d729ec98069049e1aef7254906af9c1cd50afb438bf61b46b2a813f3c5374cfbca1e06ff885a7e76f32140681340b37ba5c6e88058b71e0702b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpeek-doc"

RDEPENDS:${PN} += ""

inherit rpm
