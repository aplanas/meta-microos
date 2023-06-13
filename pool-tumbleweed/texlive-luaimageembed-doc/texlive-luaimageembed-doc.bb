SUMMARY = "Documentation for texlive-luaimageembed"
DESCRIPTION = "This package includes the documentation for texlive-luaimageembed"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn50788"

RPM_NAME = "texlive-luaimageembed-doc-2023.201.0.0.1svn50788-52.1.noarch.rpm"
RPM_HASH = "49025f300a7a9135ec3c562a2897034a9c095018c41c072771936573d39b9a002f4426da29ef27f950bbea305a79334ee6f3f485eb8bd7de44ab648d702bd1d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaimageembed-doc"

RDEPENDS:${PN} += ""

inherit rpm
