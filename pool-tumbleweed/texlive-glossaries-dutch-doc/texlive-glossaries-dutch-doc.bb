SUMMARY = "Documentation for texlive-glossaries-dutch"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-doc-2023.209.1.1svn35685-54.1.noarch.rpm"
RPM_HASH = "d8aceed4d7a4c8335efabafee6aa03e43e47e45a8e5a6507ba8b276adea7a6f0ab2d006a815e7895113d5cd96c0d316cf22303386cae1706bbfa36deeafddbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
