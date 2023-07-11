SUMMARY = "Documentation for texlive-resolsysteme"
DESCRIPTION = "This package includes the documentation for texlive-resolsysteme"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.5svn66192"

RPM_NAME = "texlive-resolsysteme-doc-2023.201.0.0.1.5svn66192-53.2.noarch.rpm"
RPM_HASH = "16c2a642c9637f7b5f84842f65f04b1871dcfadfd17a2df4cfb9dd1135ed9a7184bd9cecbcd3bdd1df1cb4c439784f3cc25f4febe427815bb3193f26580ed16f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-resolsysteme-doc-fr \
texlive-resolsysteme-doc"

RDEPENDS:${PN} += ""

inherit rpm
