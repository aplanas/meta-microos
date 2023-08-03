SUMMARY = "Documentation for texlive-pagerange"
DESCRIPTION = "This package includes the documentation for texlive-pagerange"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn16915"

RPM_NAME = "texlive-pagerange-doc-2023.209.0.0.5svn16915-52.1.noarch.rpm"
RPM_HASH = "eb7fbb318f4ccb6d1df375411ab09e1ed61c4ae4ee8240adc89bb37fe67eafbfede06b357b9b878a7d2c5dd6c358aae170bf2baf1f1b07090c2cd5dd51f612c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagerange-doc"

RDEPENDS:${PN} += ""

inherit rpm
