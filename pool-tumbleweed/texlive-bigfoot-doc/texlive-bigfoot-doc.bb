SUMMARY = "Documentation for texlive-bigfoot"
DESCRIPTION = "This package includes the documentation for texlive-bigfoot"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn38248"

RPM_NAME = "texlive-bigfoot-doc-2023.201.2.1svn38248-53.1.noarch.rpm"
RPM_HASH = "0e3edc4f9401cb5a5567cace2d15a7aae47a8d3687fc786448d3285f7709807194758f21e70e0dac498a06f3881e1b237f47278c29d531a507904d112e731142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bigfoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
