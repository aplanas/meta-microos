SUMMARY = "Documentation for texlive-pst-hsb"
DESCRIPTION = "This package includes the documentation for texlive-pst-hsb"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn61322"

RPM_NAME = "texlive-pst-hsb-doc-2023.201.0.0.02svn61322-52.1.noarch.rpm"
RPM_HASH = "e85006df0ca2f053fb192c854652010d152d17af4cc90087a76c83b758814796337f76d3e5a9994faf5cce0b31f2768805774db4d14567c8eb6ab5b5812d101f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-hsb-doc"

RDEPENDS:${PN} += ""

inherit rpm
