SUMMARY = "Documentation for texlive-algorithmicx"
DESCRIPTION = "This package includes the documentation for texlive-algorithmicx"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-algorithmicx-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "8e0fe0a7f28dda507048791f956224dc9fb56df866c086c8264f824d1658cd8bff70b9c31d81845cb36c93d1d948e1469f95f16aa8f79fbb3cab0a1886765e75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algorithmicx-doc"

RDEPENDS:${PN} += ""

inherit rpm
