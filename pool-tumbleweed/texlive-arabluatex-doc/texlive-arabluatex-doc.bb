SUMMARY = "Documentation for texlive-arabluatex"
DESCRIPTION = "This package includes the documentation for texlive-arabluatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.20svn54512"

RPM_NAME = "texlive-arabluatex-doc-2023.201.1.20svn54512-54.1.noarch.rpm"
RPM_HASH = "68772876a1bf2b77b4441240b3d8153d247d7cac566c46a59fff278de7ca02a6ec5b210bc77dbbd4474a9fa28b9750f600e67aa4cdb18a51362b653685af3d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
