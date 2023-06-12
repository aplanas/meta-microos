SUMMARY = "Documentation for texlive-arraycols"
DESCRIPTION = "This package includes the documentation for texlive-arraycols"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61719"

RPM_NAME = "texlive-arraycols-doc-2023.201.1.2svn61719-53.1.noarch.rpm"
RPM_HASH = "c19ab98a84c11207d11720ffb083d3404f205132f6be88c6b4550c2349ff7a83fff8b79906c893866a4f4598491e2915cea7397f733701ce5ace353a2c318fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arraycols-doc"
RDEPENDS:${PN} += ""

inherit rpm
