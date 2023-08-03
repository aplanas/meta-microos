SUMMARY = "Documentation for texlive-scsnowman"
DESCRIPTION = "This package includes the documentation for texlive-scsnowman"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.3csvn66115"

RPM_NAME = "texlive-scsnowman-doc-2023.209.1.3csvn66115-54.1.noarch.rpm"
RPM_HASH = "c80d6c6be7d0117f29fe696afc78215341e67b28c0c9e4e23155020849b851abfb945395c8b5ffdfbee416e5523834987bba35720e7ad8b6732f018fa9648b9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scsnowman-doc-ja \
texlive-scsnowman-doc"

RDEPENDS:${PN} += ""

inherit rpm
