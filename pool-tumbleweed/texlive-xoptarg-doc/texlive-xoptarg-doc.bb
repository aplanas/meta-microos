SUMMARY = "Documentation for texlive-xoptarg"
DESCRIPTION = "This package includes the documentation for texlive-xoptarg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-xoptarg-doc-2023.209.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "41070c52f44f1d876111206b475d3fe1fb482e885bf27d45509b31adc194ac850b8ec802f61f7b9ec77c76070289611937b3454f3b6a2c2c9416f32b2d9745ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xoptarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
