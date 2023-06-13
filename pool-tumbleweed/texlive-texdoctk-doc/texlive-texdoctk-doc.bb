SUMMARY = "Documentation for texlive-texdoctk"
DESCRIPTION = "This package includes the documentation for texlive-texdoctk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6.0svn62186"

RPM_NAME = "texlive-texdoctk-doc-2023.201.0.0.6.0svn62186-54.1.noarch.rpm"
RPM_HASH = "761a5f57741cd342fa7c56304d3f4c7b9a13dd88e0fdbdbd91887df06852721e3b81a456ab16cf7b9aa99d549da63ab97618736307b3e5ecb42362d4848cebb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(texdoctk.1) \
texlive-texdoctk-doc"

RDEPENDS:${PN} += ""

inherit rpm
