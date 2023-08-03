SUMMARY = "Documentation for texlive-gloss-occitan"
DESCRIPTION = "This package includes the documentation for texlive-gloss-occitan"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-doc-2023.209.0.0.1svn52593-54.1.noarch.rpm"
RPM_HASH = "6336f4026711cb3711e24c8abb7b74de76538d0ce1fe0615b48a763f71187563ed31fcc6a4ab4be8b56a9ab29d0b9a3961bc67760250480ac15dafe1f67baed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan-doc"

RDEPENDS:${PN} += ""

inherit rpm
