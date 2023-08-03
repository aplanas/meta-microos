SUMMARY = "Documentation for texlive-petri-nets"
DESCRIPTION = "This package includes the documentation for texlive-petri-nets"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn39165"

RPM_NAME = "texlive-petri-nets-doc-2023.209.svn39165-52.1.noarch.rpm"
RPM_HASH = "b18a39a41aef97364657bd2d737950f99257639a2e64b7cc3e13144b2410b3ed71a3f17fc7b35d6b9e2f6bbd4771cf58a3da2ee44d425a2e77997329e4d3918e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-petri-nets-doc"

RDEPENDS:${PN} += ""

inherit rpm
