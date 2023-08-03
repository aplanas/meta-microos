SUMMARY = "Documentation for texlive-nostarch"
DESCRIPTION = "This package includes the documentation for texlive-nostarch"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-nostarch-doc-2023.209.1.3svn15878-55.1.noarch.rpm"
RPM_HASH = "2255b5478661944603c270c10e5134ce44db3ecaea3484a7c180e5c1884eca2b4a03222d4b3d2476de1e7a8295c54c9f62af682e100b146b07dfb70133a39c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nostarch-doc"

RDEPENDS:${PN} += ""

inherit rpm
