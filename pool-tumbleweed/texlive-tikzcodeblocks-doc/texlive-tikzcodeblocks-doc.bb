SUMMARY = "Documentation for texlive-tikzcodeblocks"
DESCRIPTION = "This package includes the documentation for texlive-tikzcodeblocks"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn54758"

RPM_NAME = "texlive-tikzcodeblocks-doc-2023.201.0.0.13svn54758-52.1.noarch.rpm"
RPM_HASH = "13ee8e9c040d7ae515c65472d7d08041e02043e352ebecea0fe623ccc2b562135fd23c2f94cdb9c6a7fdca9da40d5f3c6fb98b552b41530dc260fe6956ce25fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikzcodeblocks-doc-de \
texlive-tikzcodeblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
