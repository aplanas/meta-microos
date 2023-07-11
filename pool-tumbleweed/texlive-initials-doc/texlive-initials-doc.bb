SUMMARY = "Documentation for texlive-initials"
DESCRIPTION = "This package includes the documentation for texlive-initials"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54080"

RPM_NAME = "texlive-initials-doc-2023.208.svn54080-53.1.noarch.rpm"
RPM_HASH = "a7d19e5e1491f98e2605b387d5f6266c59b45886afa4b348a1798dff12b05a1630b708fd514aa076fa6b3e3baf0c08b8dd6d08dfd1655f9ba02c50cf0502834b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-initials-doc"

RDEPENDS:${PN} += ""

inherit rpm
