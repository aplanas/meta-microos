SUMMARY = "Documentation for texlive-fge"
DESCRIPTION = "This package includes the documentation for texlive-fge"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.25svn37628"

RPM_NAME = "texlive-fge-doc-2023.209.1.25svn37628-53.1.noarch.rpm"
RPM_HASH = "be25de122b407be6b591a9385b61578b572d7813bc4a9152637ccea5633e5765e9605ffbaf9dad526cd219e2a829c90e906cb9dd01a6665df974d8199399fa7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fge-doc"

RDEPENDS:${PN} += ""

inherit rpm
