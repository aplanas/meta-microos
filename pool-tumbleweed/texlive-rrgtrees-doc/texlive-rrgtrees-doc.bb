SUMMARY = "Documentation for texlive-rrgtrees"
DESCRIPTION = "This package includes the documentation for texlive-rrgtrees"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn27322"

RPM_NAME = "texlive-rrgtrees-doc-2023.201.1.1svn27322-53.1.noarch.rpm"
RPM_HASH = "ab863556abd970f4bd2180039e62b2f24f17b8362948fcb67258e34ce5e8238d5be6ef4abb88f0314eed93c1124e4fca02c2c9f24308a1ed00a74e9d74fe02a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rrgtrees-doc"
RDEPENDS:${PN} += ""

inherit rpm
