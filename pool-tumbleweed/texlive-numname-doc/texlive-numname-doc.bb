SUMMARY = "Documentation for texlive-numname"
DESCRIPTION = "This package includes the documentation for texlive-numname"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18130"

RPM_NAME = "texlive-numname-doc-2023.209.svn18130-55.1.noarch.rpm"
RPM_HASH = "f24afb511041254175d90475576526f1cd67a08fb12781e3a0b97942cb34e7e8b229c7c376f88daf96ac48e5590d43e9e49be26f9c0fb776c76819cab01184c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numname-doc"

RDEPENDS:${PN} += ""

inherit rpm
