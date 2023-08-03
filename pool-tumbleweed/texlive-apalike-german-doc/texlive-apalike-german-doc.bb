SUMMARY = "Documentation for texlive-apalike-german"
DESCRIPTION = "This package includes the documentation for texlive-apalike-german"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65403"

RPM_NAME = "texlive-apalike-german-doc-2023.209.svn65403-55.1.noarch.rpm"
RPM_HASH = "b36fbc16952cd6b0f2538ee7e5a75baeba329eb12896af65b96dd392996cf18f924605bc8e0d44c8960d9b8d7faa58b8ab9bda6e0b6030d91ec7d95c2c119b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
