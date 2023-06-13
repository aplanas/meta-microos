SUMMARY = "Documentation for texlive-footnotebackref"
DESCRIPTION = "This package includes the documentation for texlive-footnotebackref"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27034"

RPM_NAME = "texlive-footnotebackref-doc-2023.201.1.0svn27034-52.1.noarch.rpm"
RPM_HASH = "54f36b32d2b097c034788dffa59ad2d287bf230ec80007148e744eacee925a4cef9c5077d20e470783d39f043d492f1fe6a09e2ccd951047da872afa0eb2fc30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnotebackref-doc"

RDEPENDS:${PN} += ""

inherit rpm
