SUMMARY = "Documentation for texlive-ffcode"
DESCRIPTION = "This package includes the documentation for texlive-ffcode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.0svn65170"

RPM_NAME = "texlive-ffcode-doc-2023.209.0.0.8.0svn65170-53.1.noarch.rpm"
RPM_HASH = "bdf6f0aeae806e7bda3e08bc81e4fd3598f0356ee36d639ecace2ffb2cacda62d8637877e4e0353e517f419cba7bda7eda55f15fd5ddb973578954f59f0f7fbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ffcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
