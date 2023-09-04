SUMMARY = "Documentation for texlive-hrefhide"
DESCRIPTION = "This package includes the documentation for texlive-hrefhide"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn66189"

RPM_NAME = "texlive-hrefhide-doc-2023.209.1.1asvn66189-54.2.noarch.rpm"
RPM_HASH = "b68913ff5d16ddc38285eacc40baea4cfbead7da208d9d5f71d286c46ee80b79b4ad0c448e725bb5d7ea3247875e469812cd513093d5c69b0b127bbe6f87e3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hrefhide-doc"

RDEPENDS:${PN} += ""

inherit rpm
