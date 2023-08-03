SUMMARY = "Documentation for texlive-pbox"
DESCRIPTION = "This package includes the documentation for texlive-pbox"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2svn24807"

RPM_NAME = "texlive-pbox-doc-2023.209.1.2svn24807-52.1.noarch.rpm"
RPM_HASH = "38e529629d471303bf640de763ee9e65175192445932342233c40e4d7d4d1c7e2159b09f17d8b3b557e866761264498414c80812d967cdd9d8a064e89939a8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
