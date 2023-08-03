SUMMARY = "Documentation for texlive-wsuipa"
DESCRIPTION = "This package includes the documentation for texlive-wsuipa"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25469"

RPM_NAME = "texlive-wsuipa-doc-2023.209.svn25469-53.1.noarch.rpm"
RPM_HASH = "e71ac99144f90a318f33ccb11cc2c85a6c714e2dd409108f02f2b60c4e9745309ee698460881100bb4be3c62a05a4af69b8d8291ed7bfae18a68985dd604b50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsuipa-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
