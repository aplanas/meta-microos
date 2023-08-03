SUMMARY = "Documentation for texlive-pictex"
DESCRIPTION = "This package includes the documentation for texlive-pictex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn59551"

RPM_NAME = "texlive-pictex-doc-2023.209.1.1bsvn59551-52.1.noarch.rpm"
RPM_HASH = "8ae1c21c32264c8a0a18245af5acddf9448b582ca0b231c5bcd4251087ecfcd1dc7f64cf2918a7d698e70ee5527401c0678f824bfc95caae18c97843c78c3578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pictex-doc"

RDEPENDS:${PN} += ""

inherit rpm
