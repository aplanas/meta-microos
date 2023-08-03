SUMMARY = "Documentation for texlive-pagesel"
DESCRIPTION = "This package includes the documentation for texlive-pagesel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn56105"

RPM_NAME = "texlive-pagesel-doc-2023.209.1.10svn56105-52.1.noarch.rpm"
RPM_HASH = "865883900911c8f3e22e7cd70664e114a74a69fc2b62b89dcb4c48e3650c19414342fcfaf9dc0087524f1ff5366a0eacceca19de2a541a2b76bde89499f59a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pagesel-doc-en \
texlive-pagesel-doc"

RDEPENDS:${PN} += ""

inherit rpm
