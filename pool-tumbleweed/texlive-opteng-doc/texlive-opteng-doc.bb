SUMMARY = "Documentation for texlive-opteng"
DESCRIPTION = "This package includes the documentation for texlive-opteng"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27331"

RPM_NAME = "texlive-opteng-doc-2023.201.1.0svn27331-54.1.noarch.rpm"
RPM_HASH = "eee93f63b9d8dba8bd343d8ae1e5f05bcbbd91985c7e8ae521fdd5846f4a87f6314fee134a8e9885e0f1eec8a5cca8649ba04b81853206a9a22b080979c31699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-opteng-doc"
RDEPENDS:${PN} += ""

inherit rpm
