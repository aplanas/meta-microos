SUMMARY = "Documentation for texlive-newfile"
DESCRIPTION = "This package includes the documentation for texlive-newfile"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-newfile-doc-2023.201.1.0csvn15878-54.1.noarch.rpm"
RPM_HASH = "9e06fb9f1630be766dd055cf98d0c773ae75d0fa505c7cb34d34a8d36e2262a13c1a6dedf5617ba286329c367f978aa2645fda39632ba5974f6e7e3d630fedeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
