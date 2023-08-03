SUMMARY = "Documentation for texlive-pagecolor"
DESCRIPTION = "This package includes the documentation for texlive-pagecolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn65843"

RPM_NAME = "texlive-pagecolor-doc-2023.209.1.2bsvn65843-52.1.noarch.rpm"
RPM_HASH = "a704b29790f07e2039b2c4504221964072b88f11a03f17e8865a05ae15d0a549fb394daf8f9aa02f8b4862885c0fccfe1fff23f49325789ccc5fabf08d6ecf74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagecolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
