SUMMARY = "Documentation for texlive-cascade"
DESCRIPTION = "This package includes the documentation for texlive-cascade"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn65757"

RPM_NAME = "texlive-cascade-doc-2023.201.1.2asvn65757-52.1.noarch.rpm"
RPM_HASH = "e2a99ae2b84fd5966064150521fdb4866e9a2119c55422d2c947ce3d155cd0484e59fe2b0ab314b284c9bea84ae736b039ea99949f5c7f165730272db87d092d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-cascade-doc:fr) \
texlive-cascade-doc"

RDEPENDS:${PN} += ""

inherit rpm
