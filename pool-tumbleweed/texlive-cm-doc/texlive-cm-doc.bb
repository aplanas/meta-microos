SUMMARY = "Documentation for texlive-cm"
DESCRIPTION = "This package includes the documentation for texlive-cm"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn57963"

RPM_NAME = "texlive-cm-doc-2023.209.svn57963-54.1.noarch.rpm"
RPM_HASH = "1f1c92138cdadfafcaa6644e9908b2de5ea9d73bad55b388ab9f7dca29927e7924b51fa807840ce57e3b6cb2aa24d88ce73de4bca9e8956866f5d7c43e915d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-doc"

RDEPENDS:${PN} += ""

inherit rpm
