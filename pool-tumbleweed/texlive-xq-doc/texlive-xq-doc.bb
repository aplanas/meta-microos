SUMMARY = "Documentation for texlive-xq"
DESCRIPTION = "This package includes the documentation for texlive-xq"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn35211"

RPM_NAME = "texlive-xq-doc-2023.209.0.0.4svn35211-53.1.noarch.rpm"
RPM_HASH = "c2e68b4c9a04ed1e8faeb8bcdcf1504cbb1e58519c3e9f86484e46c7406c271ed5b02abe3b0bb189f3db94e874cf661077ed2db376c3c5af385468e735a4e69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xq-doc"

RDEPENDS:${PN} += ""

inherit rpm
