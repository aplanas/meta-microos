SUMMARY = "Documentation for texlive-nwafuthesis"
DESCRIPTION = "This package includes the documentation for texlive-nwafuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn63438"

RPM_NAME = "texlive-nwafuthesis-doc-2023.209.1.15svn63438-55.1.noarch.rpm"
RPM_HASH = "6a48b4976485031859dddf709fd617f507bb92f32b40012826c6d2607c02b98a3a315b6db12bb75341bab4558934216952a095a145ebfc7c5a20fb631de54c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nwafuthesis-doc-zh \
texlive-nwafuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
