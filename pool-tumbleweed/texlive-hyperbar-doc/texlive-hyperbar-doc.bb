SUMMARY = "Documentation for texlive-hyperbar"
DESCRIPTION = "This package includes the documentation for texlive-hyperbar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-doc-2023.209.0.0.1svn48147-54.1.noarch.rpm"
RPM_HASH = "f53f0eabec3e6f21bd5af1b677d50ce5eebf726ce76747ec4ea26ab79ae56e7e64fed05a12dc41b943ff0009bed29a9216ce9ae0795b89985991e011f3a4268c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyperbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
