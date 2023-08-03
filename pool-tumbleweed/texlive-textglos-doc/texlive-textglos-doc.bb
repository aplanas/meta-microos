SUMMARY = "Documentation for texlive-textglos"
DESCRIPTION = "This package includes the documentation for texlive-textglos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30788"

RPM_NAME = "texlive-textglos-doc-2023.209.1.0svn30788-55.1.noarch.rpm"
RPM_HASH = "0b56df20ef6582b6e43d8b6f64e339e29a45e5996636989234ea1a63fc08c7fad2c42e1d47bec318a97cb4c8afc76cc7079bf5d8128d0b6e33be4102edcd9ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textglos-doc"

RDEPENDS:${PN} += ""

inherit rpm
