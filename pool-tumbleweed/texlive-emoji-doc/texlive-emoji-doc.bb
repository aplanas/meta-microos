SUMMARY = "Documentation for texlive-emoji"
DESCRIPTION = "This package includes the documentation for texlive-emoji"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-doc-2023.209.0.0.2.2svn59961-54.1.noarch.rpm"
RPM_HASH = "31e433d5b15268c24f36e6a3bcdedf68bfdde5acc25b62f83a4cc0aec349c9f73d5521c83b2f494ad6428b76a25f879b4798bc199adae87ce8e39b90f5271196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
