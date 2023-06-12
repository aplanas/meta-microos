SUMMARY = "Documentation for texlive-txfonts"
DESCRIPTION = "This package includes the documentation for texlive-txfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-txfonts-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "c04b7ac9939e9126f1ddc3c2e9d15dd57ce5dd5bcfc77b078ea15037807c4989bb3d2e2966f8d8d9b68bf832d013ad6bafe2de017c9af22a7c66c5209d5f5d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txfonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
