SUMMARY = "Documentation for texlive-pythonhighlight"
DESCRIPTION = "This package includes the documentation for texlive-pythonhighlight"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43191"

RPM_NAME = "texlive-pythonhighlight-doc-2023.201.svn43191-53.2.noarch.rpm"
RPM_HASH = "3096dc9bde45a59eba56482d9c44830035b2803a31dbc18d5bd40014b3a2762eadc8219080dc3291834ff53feceec70cf61dc61c06b5a765ffd31b9416b3ab2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonhighlight-doc"

RDEPENDS:${PN} += ""

inherit rpm
