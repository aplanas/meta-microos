SUMMARY = "Documentation for texlive-pbsheet"
DESCRIPTION = "This package includes the documentation for texlive-pbsheet"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn24830"

RPM_NAME = "texlive-pbsheet-doc-2023.201.0.0.1svn24830-51.1.noarch.rpm"
RPM_HASH = "0d99795ad385e6eaa5bfde3d137b28b87d3dfbe9146aa1fae54f55c5cdf632913d3d62398d49b94a10b21ebe4be347ad18ef46a209eced9103bc0d9600d00973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pbsheet-doc-fr \
texlive-pbsheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
