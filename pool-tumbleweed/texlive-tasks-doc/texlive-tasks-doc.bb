SUMMARY = "Documentation for texlive-tasks"
DESCRIPTION = "This package includes the documentation for texlive-tasks"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4asvn61541"

RPM_NAME = "texlive-tasks-doc-2023.201.1.4asvn61541-54.1.noarch.rpm"
RPM_HASH = "a619583fee80782d3129773387aae72e9e358e22a456c94408976757b4da59935429a3ff7b0ee56062bbb54d2dc8d20bc5d11abe264d3f9b5545c1f2ec158677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tasks-doc"

RDEPENDS:${PN} += ""

inherit rpm
