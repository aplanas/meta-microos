SUMMARY = "Documentation for texlive-dvips"
DESCRIPTION = "This package includes the documentation for texlive-dvips"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-dvips-doc-2023.209.svn66203-54.1.noarch.rpm"
RPM_HASH = "b0df9ec378eda38279b2c120072ad68876768a904cdc39d3e3dc49a2fbcbc123ca4d406db4934b0dafc92a31ea99369e9248f3ab0bd4730375fa5f3cf6545fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2tfm.1 \
man-dvips.1 \
texlive-dvips-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
