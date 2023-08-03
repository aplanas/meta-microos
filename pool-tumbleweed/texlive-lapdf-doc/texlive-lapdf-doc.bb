SUMMARY = "Documentation for texlive-lapdf"
DESCRIPTION = "This package includes the documentation for texlive-lapdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn23806"

RPM_NAME = "texlive-lapdf-doc-2023.209.1.1svn23806-56.1.noarch.rpm"
RPM_HASH = "289ca7f097a7d293ac829c932a281171c51ae2ec185bf82aad282d7d5a76a215a27581efc3ed8f647ed6e9ef06dc71fddf68fd7e24e283987cce0aa5406a6164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lapdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
