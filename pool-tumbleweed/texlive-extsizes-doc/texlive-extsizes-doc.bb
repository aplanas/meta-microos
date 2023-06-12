SUMMARY = "Documentation for texlive-extsizes"
DESCRIPTION = "This package includes the documentation for texlive-extsizes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4asvn17263"

RPM_NAME = "texlive-extsizes-doc-2023.201.1.4asvn17263-52.1.noarch.rpm"
RPM_HASH = "b2cd283f8550553c245dc4e49824e9845cd4107706d44405e514b7e02e2c301f5444e8d12164bbeb8d4cb6fb2b32c60057c7f78dc728a94537a930f33db1213d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extsizes-doc"
RDEPENDS:${PN} += ""

inherit rpm
