SUMMARY = "Documentation for texlive-import"
DESCRIPTION = "This package includes the documentation for texlive-import"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.6.2svn54683"

RPM_NAME = "texlive-import-doc-2023.201.6.2svn54683-52.1.noarch.rpm"
RPM_HASH = "1ed01a200b71cb184a7e33bdd7a7bf28ddc29d57bc3d584ffb322ead84d95d7ddb66bdb71db94de42ba003e53197fb586e3c4de7c69039c6254a462d012db0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-import-doc"

RDEPENDS:${PN} += ""

inherit rpm
