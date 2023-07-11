SUMMARY = "Documentation for texlive-ecltree"
DESCRIPTION = "This package includes the documentation for texlive-ecltree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-ecltree-doc-2023.201.1.1asvn15878-53.2.noarch.rpm"
RPM_HASH = "4f193a483d261ef1b92a72f57055d3b01f49c15e2169cb949e6f365415a63b6e21d509828d94911041b058d7d654726e39848fbe51783d8f3c793aec75ffd332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecltree-doc"

RDEPENDS:${PN} += ""

inherit rpm
