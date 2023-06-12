SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-size3-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "a22ce16b571a03a0a1818b98a9d408f0415f83c838a033c037a58dbcba391d5a93abd43f3dc807427feb23b97565342203c132f446b947ebad9c5632b6e43eed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size3-fonts"
RDEPENDS:${PN} += ""

inherit rpm
