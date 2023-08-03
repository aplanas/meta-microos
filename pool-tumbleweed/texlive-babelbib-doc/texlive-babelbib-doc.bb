SUMMARY = "Documentation for texlive-babelbib"
DESCRIPTION = "This package includes the documentation for texlive-babelbib"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn57349"

RPM_NAME = "texlive-babelbib-doc-2023.209.1.34svn57349-54.1.noarch.rpm"
RPM_HASH = "6d5ea42e20e14433d79406f130087184d67a314987748c885265873e2378c8d841cb996c8ebeaf1fc7cd1cdae740d38a8de3a1472d7c19f73931174d89dca841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babelbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
