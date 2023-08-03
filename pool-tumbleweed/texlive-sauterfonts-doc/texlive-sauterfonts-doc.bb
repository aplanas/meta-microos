SUMMARY = "Documentation for texlive-sauterfonts"
DESCRIPTION = "This package includes the documentation for texlive-sauterfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-sauterfonts-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "38f17bbecde82f8582b051ebe1b27c57eb165fff2bea89f9e443c5b94f5e0f758c8cf736fd0f6d6400c408b90e6ca396e0764b6830dcacac539fa0ab4d4079f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauterfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
