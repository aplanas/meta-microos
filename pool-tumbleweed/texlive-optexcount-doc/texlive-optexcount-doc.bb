SUMMARY = "Documentation for texlive-optexcount"
DESCRIPTION = "This package includes the documentation for texlive-optexcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn59817"

RPM_NAME = "texlive-optexcount-doc-2023.201.1.1svn59817-54.1.noarch.rpm"
RPM_HASH = "f71758beda745d06cec29324ff4bdd8dab4642ee4e43988563d85aad7226bbe75ac9372170c61b9568ceceedd7c2f74591e5e5f9e674c4734f1d29cc28d549f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optexcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
