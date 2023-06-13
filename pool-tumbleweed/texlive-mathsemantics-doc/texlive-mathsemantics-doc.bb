SUMMARY = "Documentation for texlive-mathsemantics"
DESCRIPTION = "This package includes the documentation for texlive-mathsemantics"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn63241"

RPM_NAME = "texlive-mathsemantics-doc-2023.201.1.0.0svn63241-52.1.noarch.rpm"
RPM_HASH = "187853df6d187996d2cb23ca6d51671dc8fd54c28c3672212fff79221a4c491e311f446a568e89f9e12ef8375964dc923ded5fef95f94da95300ba088bef5a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathsemantics-doc"

RDEPENDS:${PN} += ""

inherit rpm
