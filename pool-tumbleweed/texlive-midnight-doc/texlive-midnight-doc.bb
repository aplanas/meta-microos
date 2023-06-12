SUMMARY = "Documentation for texlive-midnight"
DESCRIPTION = "This package includes the documentation for texlive-midnight"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-midnight-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "a5900221ed9de4e803e83006f91c7ff022eccac6158ff4126e6d8ab6925e281b49b4de3807d7888d933cbcdc918833f37530f2cd8189576d4025f10bd5be493f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-midnight-doc"
RDEPENDS:${PN} += ""

inherit rpm
