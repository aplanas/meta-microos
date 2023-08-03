SUMMARY = "Documentation for texlive-2up"
DESCRIPTION = "This package includes the documentation for texlive-2up"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn55076"

RPM_NAME = "texlive-2up-doc-2023.209.1.3asvn55076-55.1.noarch.rpm"
RPM_HASH = "72042c8d254b6f0788d42edd5f9cd11f1941930b50bfb282eee24496185a9ca28b7cbc3f0ebf839b4f872a414f98dc93776fdca09f36cc314ed695b3e0b27986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-2up-doc"

RDEPENDS:${PN} += ""

inherit rpm
