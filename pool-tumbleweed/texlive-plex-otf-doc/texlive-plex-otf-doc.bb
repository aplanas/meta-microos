SUMMARY = "Documentation for texlive-plex-otf"
DESCRIPTION = "This package includes the documentation for texlive-plex-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.07asvn47562"

RPM_NAME = "texlive-plex-otf-doc-2023.209.0.0.07asvn47562-53.1.noarch.rpm"
RPM_HASH = "a699492b51eb7c63707064eba7cdd1fea359a40817e81a3e60f30adf3ae1e6868e1e5b9d287bd03619ecd52c98a86393e82a2a24266701b49ac04434d9bc391f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plex-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
