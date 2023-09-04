SUMMARY = "Documentation for texlive-zhlineskip"
DESCRIPTION = "This package includes the documentation for texlive-zhlineskip"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-doc-2023.209.1.0esvn51142-53.2.noarch.rpm"
RPM_HASH = "b92b7219bdf0c529ce7f59b94af139a23c903495d54e0c0e0dd15adfc88102980d7c58ac824f509d2adc7f215518bfe262d5ec19c6d6f11946645ef9831ba751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhlineskip-doc-zh \
texlive-zhlineskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
