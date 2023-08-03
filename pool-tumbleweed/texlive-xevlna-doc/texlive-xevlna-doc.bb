SUMMARY = "Documentation for texlive-xevlna"
DESCRIPTION = "This package includes the documentation for texlive-xevlna"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn43864"

RPM_NAME = "texlive-xevlna-doc-2023.209.1.1svn43864-53.1.noarch.rpm"
RPM_HASH = "8b6d64ff6095d9612ed124baf71af902fdaccec2d7405fb4e7331681905b7bc7113965d72bd034220f0dedd7c602af8aa95021a153302adbf59b7c27f873825a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xevlna-doc"

RDEPENDS:${PN} += ""

inherit rpm
