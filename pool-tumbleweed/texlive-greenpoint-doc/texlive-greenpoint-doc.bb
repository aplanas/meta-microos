SUMMARY = "Documentation for texlive-greenpoint"
DESCRIPTION = "This package includes the documentation for texlive-greenpoint"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-greenpoint-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "59aae2f797067f558e9d392405f3eef918afb0d67ff031f484c2c0feeb88889d566765c1336bab1da7cefec0b4776d2626b251a9718de452479b196907ed64ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greenpoint-doc"

RDEPENDS:${PN} += ""

inherit rpm
