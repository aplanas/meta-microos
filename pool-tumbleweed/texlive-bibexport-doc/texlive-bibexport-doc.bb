SUMMARY = "Documentation for texlive-bibexport"
DESCRIPTION = "This package includes the documentation for texlive-bibexport"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.03svn50677"

RPM_NAME = "texlive-bibexport-doc-2023.209.3.03svn50677-54.1.noarch.rpm"
RPM_HASH = "35ddf43b4d9b8aeffd2febd93445ef73d4c46a10902ff7f574182a36225994030843bbc2391ceac715d6a3b8a80617095cd5005d3bbf503607c28f56637aefc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibexport-doc"

RDEPENDS:${PN} += ""

inherit rpm
