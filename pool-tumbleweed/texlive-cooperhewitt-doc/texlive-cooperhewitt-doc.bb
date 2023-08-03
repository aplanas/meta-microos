SUMMARY = "Documentation for texlive-cooperhewitt"
DESCRIPTION = "This package includes the documentation for texlive-cooperhewitt"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64967"

RPM_NAME = "texlive-cooperhewitt-doc-2023.209.svn64967-55.1.noarch.rpm"
RPM_HASH = "aec28e59a4ea8137c478f309b4759b60ef929fb478aab32062230b69862c194c926107b3e3178d2f58d7267bb4112b870d59d83c970f1a06665a1cbe350815c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooperhewitt-doc"

RDEPENDS:${PN} += ""

inherit rpm
