SUMMARY = "Documentation for texlive-storebox"
DESCRIPTION = "This package includes the documentation for texlive-storebox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn64967"

RPM_NAME = "texlive-storebox-doc-2023.209.1.3asvn64967-58.1.noarch.rpm"
RPM_HASH = "c79a47bef66b8260fb99e2b41d93aa763b0f4747c50e33871c22cdc27867b51be43ba90dfdb1be318dc13007b7b93698f9339b2a849765a8bb4889ddb6b86f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-storebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
