SUMMARY = "Documentation for texlive-mathdesign"
DESCRIPTION = "This package includes the documentation for texlive-mathdesign"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.31svn31639"

RPM_NAME = "texlive-mathdesign-doc-2023.201.2.31svn31639-52.1.noarch.rpm"
RPM_HASH = "2d3367761af52b46b84fd4be593cb32dc6b0f4bfdb16ff63e1c96e02fc7581b82d143b00e0b7c20be6150087a0dd240256830c7713064c2cfd3e95ffb59befc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathdesign-doc"
RDEPENDS:${PN} += ""

inherit rpm
