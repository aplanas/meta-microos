SUMMARY = "Documentation for texlive-bangtex"
DESCRIPTION = "This package includes the documentation for texlive-bangtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55475"

RPM_NAME = "texlive-bangtex-doc-2023.209.svn55475-54.1.noarch.rpm"
RPM_HASH = "999a0107d3d0b3cf98e65d2ce230c2d754d97829bf2cb6f790f48fa2999a17838f21c523b5c8a3b8775b49065aba688f858c33f159d9bf5b40e03ae860dc51f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
