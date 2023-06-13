SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-size2-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "9c8e0dc2edb9f90a9381541f8bd8d1e9d3a2986c5771045ee8c46b301810d75eac479e0c12bd3bfa35c6348fbb4ec195191a2cf1c83b1339604d68441ee5861c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size2-fonts"

RDEPENDS:${PN} += ""

inherit rpm
