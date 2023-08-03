SUMMARY = "Documentation for texlive-pdfescape"
DESCRIPTION = "This package includes the documentation for texlive-pdfescape"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn53082"

RPM_NAME = "texlive-pdfescape-doc-2023.209.1.15svn53082-52.1.noarch.rpm"
RPM_HASH = "a08d303b819498e6a26e348041a66f0c6c90d5b2bea9804aeb277a3fc1c201cd1732890dc5b2627bfba5bc98faa73109f10c0683814025bd076dce97a79f7716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfescape-doc"

RDEPENDS:${PN} += ""

inherit rpm
