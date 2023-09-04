SUMMARY = "Documentation for texlive-glossaries-serbian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "efd6300413a6cd3bf4f65f2262708cf4a4f735b4d5db65739d462fc15fbf00ac27900a260a5950440302dbf54ca3284ef5bbaef2feaeaea86959a3de449b233e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
