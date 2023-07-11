SUMMARY = "Documentation for texlive-xetexko"
DESCRIPTION = "This package includes the documentation for texlive-xetexko"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn64894"

RPM_NAME = "texlive-xetexko-doc-2023.201.4.2svn64894-52.2.noarch.rpm"
RPM_HASH = "83635c598a5d90f20fb179f0403913048bad89d72ed87dd508f88cb8c6622e11b7190e05a2a19bd4630b3342e9a16e85320fa32527432dd76795c88a35b5e313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xetexko-doc-ko \
texlive-xetexko-doc"

RDEPENDS:${PN} += ""

inherit rpm
