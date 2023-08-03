SUMMARY = "Documentation for texlive-classpack"
DESCRIPTION = "This package includes the documentation for texlive-classpack"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.19svn55218"

RPM_NAME = "texlive-classpack-doc-2023.209.1.19svn55218-54.1.noarch.rpm"
RPM_HASH = "96d85e39454b96a0432abf817a35c1621ab44623a9ec0565a1d9f85530f735450e1ff1c0d1c6770b00b9f428cf363d62cfab0cb5b8e57b0cf63f0a07e9267373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classpack-doc"

RDEPENDS:${PN} += ""

inherit rpm
