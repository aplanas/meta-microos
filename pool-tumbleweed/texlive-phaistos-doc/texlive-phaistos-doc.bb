SUMMARY = "Documentation for texlive-phaistos"
DESCRIPTION = "This package includes the documentation for texlive-phaistos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18651"

RPM_NAME = "texlive-phaistos-doc-2023.209.1.0svn18651-52.1.noarch.rpm"
RPM_HASH = "daa2e8ddffe8ff23739b1786f884855573aabdaa984dcc82488b04ad2a8ca813d5b75b3cc744ccd199e15b474d1f5f59f9999dfe081ae2bea71fc0b40c2cb0dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phaistos-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
