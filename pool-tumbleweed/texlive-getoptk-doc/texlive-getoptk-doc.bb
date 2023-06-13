SUMMARY = "Documentation for texlive-getoptk"
DESCRIPTION = "This package includes the documentation for texlive-getoptk"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn23567"

RPM_NAME = "texlive-getoptk-doc-2023.201.1.0svn23567-52.1.noarch.rpm"
RPM_HASH = "a6d98a686cbd14da135ace0f4aa01708719039f7c50279aeb2428a4d9da1b83077ac74ea08c57e9b123a1df69f0d52feab5e65aca2a8a1b865bd727050bd0aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getoptk-doc"

RDEPENDS:${PN} += ""

inherit rpm
