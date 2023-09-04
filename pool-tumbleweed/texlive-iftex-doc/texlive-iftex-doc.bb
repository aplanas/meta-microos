SUMMARY = "Documentation for texlive-iftex"
DESCRIPTION = "This package includes the documentation for texlive-iftex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0fsvn61910"

RPM_NAME = "texlive-iftex-doc-2023.209.1.0fsvn61910-54.1.noarch.rpm"
RPM_HASH = "96a099ed694cc0239c8dcc839d761eb4c830612fc5794696563906b8ef4740491e5a87473533c18592f84408ac44477aae7c4646ff48f4d1d377d926792ac5b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iftex-doc"

RDEPENDS:${PN} += ""

inherit rpm
