SUMMARY = "Documentation for texlive-arabluatex"
DESCRIPTION = "This package includes the documentation for texlive-arabluatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.20svn54512"

RPM_NAME = "texlive-arabluatex-doc-2023.209.1.20svn54512-55.1.noarch.rpm"
RPM_HASH = "a564a58b9143b706a3fb1235e2c3de058fe994cf4f35afb849a3512701438c7f80163f23f550fbc5803c5299eda9ae826e05e116d4ebc5851500321823a1328d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
