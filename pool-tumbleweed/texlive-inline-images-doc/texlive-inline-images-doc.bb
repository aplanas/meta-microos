SUMMARY = "Documentation for texlive-inline-images"
DESCRIPTION = "This package includes the documentation for texlive-inline-images"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-inline-images-doc-2023.209.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "88ff4fbd8b491dcae67ff497169412c63376c9df1d81680b80fc24777c80385de8139deb1a755d942f626e28140b8f1fffb5194d541f481b9c5213e6850e5a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inline-images-doc"

RDEPENDS:${PN} += ""

inherit rpm
