SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-caligraphic-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "525fef58b0f7c89b478b415383f336b0a3bb67d437720e66fe1aaba180a0ebdf6c0d6e0986802c18c71f1a204061b659c39d6151b7e2d1f3f0b625be65ee66d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-caligraphic-fonts"

RDEPENDS:${PN} += ""

inherit rpm
