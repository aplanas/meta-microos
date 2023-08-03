SUMMARY = "Documentation for texlive-cool"
DESCRIPTION = "This package includes the documentation for texlive-cool"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.35svn15878"

RPM_NAME = "texlive-cool-doc-2023.209.1.35svn15878-55.1.noarch.rpm"
RPM_HASH = "685e7da44cf73c1dd571e61c3c92fe7fd2cb3b9f7f6037d71cd0071805759f776cccf3d65646af077d7524841614887f0c45e5241a6eb1e080fbd620dc6369ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cool-doc"

RDEPENDS:${PN} += ""

inherit rpm
