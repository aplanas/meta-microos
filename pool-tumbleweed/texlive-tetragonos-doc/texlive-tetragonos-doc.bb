SUMMARY = "Documentation for texlive-tetragonos"
DESCRIPTION = "This package includes the documentation for texlive-tetragonos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn49732"

RPM_NAME = "texlive-tetragonos-doc-2023.209.1svn49732-55.1.noarch.rpm"
RPM_HASH = "20dba75162150ea75bbfd025cadc46303d6ac81147387d5a3c6a6830cddc994818983b1957b4c34e6137ab78b88b075cc99d2de34e0c1daaf0639de203e353c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tetragonos-doc-zh \
texlive-tetragonos-doc"

RDEPENDS:${PN} += ""

inherit rpm
