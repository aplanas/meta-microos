SUMMARY = "Documentation for texlive-stricttex"
DESCRIPTION = "This package includes the documentation for texlive-stricttex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2betasvn56320"

RPM_NAME = "texlive-stricttex-doc-2023.209.0.0.2betasvn56320-58.1.noarch.rpm"
RPM_HASH = "af7a6bffbd0f4653f04d0630784ce506d8af315d776ca7ee3b04152b49f034a648f55d27ee3cebea85dde011584e45cb340723e2ef091b136d7f65fd85572a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stricttex-doc"

RDEPENDS:${PN} += ""

inherit rpm
