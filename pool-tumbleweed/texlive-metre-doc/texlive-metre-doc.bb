SUMMARY = "Documentation for texlive-metre"
DESCRIPTION = "This package includes the documentation for texlive-metre"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18489"

RPM_NAME = "texlive-metre-doc-2023.209.1.0svn18489-55.1.noarch.rpm"
RPM_HASH = "0ffbef83495c82b247e54a0059de781867b92fcdd8727e4750edfc111ad71107137105c0bcc1774bb27bc67bd0453226d69f8ad0dd0ccf53cd46f9393a90249f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metre-doc"

RDEPENDS:${PN} += ""

inherit rpm
