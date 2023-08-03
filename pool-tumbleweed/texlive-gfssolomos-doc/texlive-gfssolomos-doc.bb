SUMMARY = "Documentation for texlive-gfssolomos"
DESCRIPTION = "This package includes the documentation for texlive-gfssolomos"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn18651"

RPM_NAME = "texlive-gfssolomos-doc-2023.209.1.0svn18651-53.1.noarch.rpm"
RPM_HASH = "a9787cec90f27dcaa7f1e83fdd07f380cdc4fc607213a64e7d9238df363a631af702fe948681620a9afa907210c6bdece2b4f986c3cfe6caa55a80d2ffb23d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfssolomos-doc"

RDEPENDS:${PN} += ""

inherit rpm
