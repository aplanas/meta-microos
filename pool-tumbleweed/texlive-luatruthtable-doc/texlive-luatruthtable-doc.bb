SUMMARY = "Documentation for texlive-luatruthtable"
DESCRIPTION = "This package includes the documentation for texlive-luatruthtable"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64508"

RPM_NAME = "texlive-luatruthtable-doc-2023.201.1.1svn64508-52.1.noarch.rpm"
RPM_HASH = "8a3bc11ebeec4e68e6795cf37ac9b2c93a9598e2d53c48cc56cde9b84311446e37cd11abee6d1eb9ab01195a757bc2b8e11ac115c046be4969fc2146d1becfe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatruthtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
