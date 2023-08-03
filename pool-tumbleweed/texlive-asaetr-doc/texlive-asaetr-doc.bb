SUMMARY = "Documentation for texlive-asaetr"
DESCRIPTION = "This package includes the documentation for texlive-asaetr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-asaetr-doc-2023.209.1.0asvn15878-54.1.noarch.rpm"
RPM_HASH = "b2d059f762a109eb9f74d0a973db9d96892847c924fa98371e2e1e54f29c8e004773dec0ca0edd363210d0ae3e6f01813c38bd02020d8fb94a5ba18c73812695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asaetr-doc"

RDEPENDS:${PN} += ""

inherit rpm
