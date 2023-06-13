SUMMARY = "FOP plug-in for jlatexmath"
DESCRIPTION = "This package contains the FOP plug-in for jlatexmath."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-fop-1.0.3-6.6.noarch.rpm"
RPM_HASH = "0ace26effe174aeb07e86cb9389437981cc846bf2940d76865bbc6ca8fe925fb1f54419f62c1b38490fd51a0ce9337c8660468c95b7de5fe143e0c2d37e8e19e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath-fop"

RDEPENDS:${PN} += "javapackages-tools \
jlatexmath \
xmlgraphics-fop"

inherit rpm
