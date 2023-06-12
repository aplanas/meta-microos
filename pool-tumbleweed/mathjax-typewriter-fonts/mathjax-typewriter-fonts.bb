SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-typewriter-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "a7c83130713faa0bd56d4728641a8f5f676ac1927b5e9984dc040d6e17444814fa8c8be39c5eca276e1304bd707e6ffa6e4068ab360ac9a8e0644f14bb518228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-typewriter-fonts"
RDEPENDS:${PN} += ""

inherit rpm
