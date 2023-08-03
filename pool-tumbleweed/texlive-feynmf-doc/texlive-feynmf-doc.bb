SUMMARY = "Documentation for texlive-feynmf"
DESCRIPTION = "This package includes the documentation for texlive-feynmf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.08svn17259"

RPM_NAME = "texlive-feynmf-doc-2023.209.1.08svn17259-53.1.noarch.rpm"
RPM_HASH = "cae803851ee09e45e6564673692de85dc17045f6a6f2c580897b64996752bf80e6f05d4c96cd944bb97e45557786b3908eabcf05ee0f162d85bac5c2566dbaa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feynmf-doc"

RDEPENDS:${PN} += ""

inherit rpm
