SUMMARY = "Documentation for texlive-refstyle"
DESCRIPTION = "This package includes the documentation for texlive-refstyle"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn20318"

RPM_NAME = "texlive-refstyle-doc-2023.201.0.0.5svn20318-53.1.noarch.rpm"
RPM_HASH = "0806048c556fe0cda63a10dd24dbbbfe31161bcf22024e54b8c6a3121ee65686ede1faed2ed1d304ac17e811adbe040f19e3413832548d65aceb60fc4bfc1a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
