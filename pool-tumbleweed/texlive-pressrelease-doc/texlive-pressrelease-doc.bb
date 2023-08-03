SUMMARY = "Documentation for texlive-pressrelease"
DESCRIPTION = "This package includes the documentation for texlive-pressrelease"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35147"

RPM_NAME = "texlive-pressrelease-doc-2023.209.1.0svn35147-53.1.noarch.rpm"
RPM_HASH = "9df5e7f2dee61bc66940ea5cfd5238f2ce9ecd796008e38714a9c543e6e371f8652eb4123a8553ac364142f51e33c44b0fedac8858a8de5dcc5735b63d9fdfb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pressrelease-doc"

RDEPENDS:${PN} += ""

inherit rpm
