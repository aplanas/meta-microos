SUMMARY = "Documentation for texlive-bibleref-german"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-german"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn21923"

RPM_NAME = "texlive-bibleref-german-doc-2023.209.1.0asvn21923-54.1.noarch.rpm"
RPM_HASH = "2c1dcb7e6b2cdc409dbaf95e9d42c6c1ec9ae48c1ff6ed1bcc828cd4e95536d435bec07b00fe2edb76558ce8fae72dc9191eca7ddd6c1d3404ff3533244ce057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bibleref-german-doc-de;en \
texlive-bibleref-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
