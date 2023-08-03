SUMMARY = "Documentation for texlive-arev"
DESCRIPTION = "This package includes the documentation for texlive-arev"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-arev-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "a78c1f5a1c6caed73f4ae5251a2155bcd80e0208abdd36b95eaf579f5fc513c7dadf17cddc8dd348213b78c9337df2de33060b3d3702ce2cfa15ff40ff26cac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arev-doc"

RDEPENDS:${PN} += ""

inherit rpm
