SUMMARY = "Documentation for texlive-gs1"
DESCRIPTION = "This package includes the documentation for texlive-gs1"
LICENSE = "LPPL-1.0"

PV = "2023.209.23svn59620"

RPM_NAME = "texlive-gs1-doc-2023.209.23svn59620-54.2.noarch.rpm"
RPM_HASH = "cfaecc4494dda068304c1d19f6f91cad101f2d16d589da8d6345cac053769eb3866692ec03ff06de27c0c65e9d24036d5c3e9fedf9be8f9384e3088a5336e1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gs1-doc"

RDEPENDS:${PN} += ""

inherit rpm
