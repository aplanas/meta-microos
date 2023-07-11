SUMMARY = "Documentation for texlive-greekdates"
DESCRIPTION = "This package includes the documentation for texlive-greekdates"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-greekdates-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "efba1293be685f57266cab3cd589569408d145e62f74aa88e0efec99ae3202665314606bbf1de105ce3907c22d87bc2983f2905391ec20f805b5e4d541c478ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greekdates-doc"

RDEPENDS:${PN} += ""

inherit rpm
