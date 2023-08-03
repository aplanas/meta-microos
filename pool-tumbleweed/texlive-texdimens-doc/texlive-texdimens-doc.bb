SUMMARY = "Documentation for texlive-texdimens"
DESCRIPTION = "This package includes the documentation for texlive-texdimens"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn61070"

RPM_NAME = "texlive-texdimens-doc-2023.209.1.1svn61070-55.1.noarch.rpm"
RPM_HASH = "b129ffd5f5535d8e0ff9f7d26eecd07cf19f06eedaca37226a22616657632a628eb2ad99ab463758b9498df399636b9085e943d0fc75886d6cde6f1d36319a5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texdimens-doc"

RDEPENDS:${PN} += ""

inherit rpm
