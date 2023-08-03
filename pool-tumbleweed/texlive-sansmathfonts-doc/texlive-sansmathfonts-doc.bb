SUMMARY = "Documentation for texlive-sansmathfonts"
DESCRIPTION = "This package includes the documentation for texlive-sansmathfonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64661"

RPM_NAME = "texlive-sansmathfonts-doc-2023.209.svn64661-54.1.noarch.rpm"
RPM_HASH = "7e7bbfc24f1dadbbf3420917177419a0a66d5a899cd5a95faa73be0ea07a9c81478ea5ff9babec143587441027ef82bee0f0c7424057e0ad3e254734c9689583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmathfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
