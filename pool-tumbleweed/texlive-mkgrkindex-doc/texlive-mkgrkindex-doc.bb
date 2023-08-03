SUMMARY = "Documentation for texlive-mkgrkindex"
DESCRIPTION = "This package includes the documentation for texlive-mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn26313"

RPM_NAME = "texlive-mkgrkindex-doc-2023.209.2.0svn26313-55.1.noarch.rpm"
RPM_HASH = "7017c56e4860748d8a4cca9e1c350903886d83d0eb9c9325bfeb162508d85cfc9144a6c0fe9fab4aa6a9fe4f95922f17cd57db5e3a16471f14ff724dfa9898df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkgrkindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
