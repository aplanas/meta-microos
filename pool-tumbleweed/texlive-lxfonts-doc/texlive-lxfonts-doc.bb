SUMMARY = "Documentation for texlive-lxfonts"
DESCRIPTION = "This package includes the documentation for texlive-lxfonts"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.0bsvn32354"

RPM_NAME = "texlive-lxfonts-doc-2023.208.2.0bsvn32354-53.1.noarch.rpm"
RPM_HASH = "4749667b38c498bcda51d0c69b4ece1b901035fa2cd4a52b46c14f35a44f3a48b9510ba188d7f11d68dfd299a9fa375424ec19bc638c8a75a10ff826620baa37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lxfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
