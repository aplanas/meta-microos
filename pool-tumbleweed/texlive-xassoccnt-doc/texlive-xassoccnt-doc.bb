SUMMARY = "Documentation for texlive-xassoccnt"
DESCRIPTION = "This package includes the documentation for texlive-xassoccnt"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn61112"

RPM_NAME = "texlive-xassoccnt-doc-2023.209.2.0svn61112-53.1.noarch.rpm"
RPM_HASH = "4505ebfea0af0d6851e367160df2c8060246ca731224ba78b9a49fe0f27c8b42492216c6bbff44237437ac721d42d882f831d1b73dbe54bbbad8650c1fbcb5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xassoccnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
