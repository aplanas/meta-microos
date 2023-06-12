SUMMARY = "Documentation for texlive-bartel-chess-fonts"
DESCRIPTION = "This package includes the documentation for texlive-bartel-chess-fonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn20619"

RPM_NAME = "texlive-bartel-chess-fonts-doc-2023.201.svn20619-53.1.noarch.rpm"
RPM_HASH = "623510d8c6461f8e174837aa2be29049517baddb73e7918ce3e8d79dc005599ee0741ee5e60c38e25b51db6b00cbbb7824432af417c8ea9b112edeeb6f74e4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bartel-chess-fonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
