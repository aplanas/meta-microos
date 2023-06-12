SUMMARY = "Documentation for texlive-shade"
DESCRIPTION = "This package includes the documentation for texlive-shade"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn22212"

RPM_NAME = "texlive-shade-doc-2023.201.1svn22212-53.1.noarch.rpm"
RPM_HASH = "96d988731689b1ff1678026fff3be6307de93912c8045afe93d6d5ac3c01204d16dd7051609c26a147b7bccc109993bf33cb7b29b0400bfbf7cb61279fc5861c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-shade-doc:en) \
texlive-shade-doc"
RDEPENDS:${PN} += ""

inherit rpm
