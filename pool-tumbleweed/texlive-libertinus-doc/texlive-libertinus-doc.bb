SUMMARY = "Documentation for texlive-libertinus"
DESCRIPTION = "This package includes the documentation for texlive-libertinus"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn61719"

RPM_NAME = "texlive-libertinus-doc-2023.209.0.0.02svn61719-55.1.noarch.rpm"
RPM_HASH = "f531e4ffdce1bae3497a605070a67c1e13e6ba60833abefa779af2bd66d2bac177c07d8580542189c5fec3b156d5999da552e75b4b5194030a824d44edf96c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-doc"

RDEPENDS:${PN} += ""

inherit rpm
