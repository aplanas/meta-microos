SUMMARY = "Documentation for texlive-xebaposter"
DESCRIPTION = "This package includes the documentation for texlive-xebaposter"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.53svn63513"

RPM_NAME = "texlive-xebaposter-doc-2023.201.2.53svn63513-52.2.noarch.rpm"
RPM_HASH = "14e2b59ae2ec9a58547c97466700a386792fa0f6bdf759cf12fb72a8f4120f60165900283ca0f834ac8ebf90c17edc270487aafc4af68056f00f6276b3a9174c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xebaposter-doc-fa \
texlive-xebaposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
