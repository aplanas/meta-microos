SUMMARY = "Documentation for texlive-fpl"
DESCRIPTION = "This package includes the documentation for texlive-fpl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.003svn54512"

RPM_NAME = "texlive-fpl-doc-2023.209.1.003svn54512-53.1.noarch.rpm"
RPM_HASH = "3a6ada8f7546f970904d8f67a8f9c94102ae9be7254e35c62d6b4a6b837c8c6235478c9c8ebf8dbc1aa62d3235a8074263c3c451225e4df903067b20a771112e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
