SUMMARY = "Documentation for texlive-texlive.infra"
DESCRIPTION = "This package includes the documentation for texlive-texlive.infra"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66512"

RPM_NAME = "texlive-texlive.infra-doc-2023.209.svn66512-55.1.noarch.rpm"
RPM_HASH = "a243b69c509fa8ea08fc9696d7d5fdb427f169cf3bb6f83da89ea455795c560446d78696de4dcc1354594aa6aecebd0fbe53dc634912ae6a848e44730d143768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mktexlsr.1 \
man-tlmgr.1 \
texlive-texlive.infra-doc"

RDEPENDS:${PN} += ""

inherit rpm
