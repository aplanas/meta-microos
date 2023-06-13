SUMMARY = "Documentation for texlive-setspace"
DESCRIPTION = "This package includes the documentation for texlive-setspace"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.7bsvn65206"

RPM_NAME = "texlive-setspace-doc-2023.201.6.7bsvn65206-53.1.noarch.rpm"
RPM_HASH = "ba7f85125c200ea4402b7879b559999565da4e5a68eb462de269a01b0d891e30144972e8b8d018e57904b3a10406616c04648c1c9c53d1b41429023cc8f5c468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-setspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
