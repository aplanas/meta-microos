SUMMARY = "Documentation for texlive-inlinelabel"
DESCRIPTION = "This package includes the documentation for texlive-inlinelabel"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-doc-2023.208.1.2.1svn63853-53.1.noarch.rpm"
RPM_HASH = "cd9ef20a5967b79e766b2a9558aabe438e852ab7c5740e138f33354c1f28ee3189e8a99f771d1edf6ab1c2887e7ae9859736d080e057b9ac0deecd9e0c9b703e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinelabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
