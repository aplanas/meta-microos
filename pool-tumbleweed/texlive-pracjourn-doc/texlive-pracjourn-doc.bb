SUMMARY = "Documentation for texlive-pracjourn"
DESCRIPTION = "This package includes the documentation for texlive-pracjourn"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.4nsvn61719"

RPM_NAME = "texlive-pracjourn-doc-2023.209.0.0.4nsvn61719-53.1.noarch.rpm"
RPM_HASH = "2f3c636a486294c87ed8fb66059520b61116ddcb8fbf606537e5f4e6fd556244451bb6c7e318d907bd1830bdaa5e4aec4a5fe22afff952a2338d610bf40fa4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pracjourn-doc"

RDEPENDS:${PN} += ""

inherit rpm
