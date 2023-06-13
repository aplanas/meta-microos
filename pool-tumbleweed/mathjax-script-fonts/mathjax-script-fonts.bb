SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-script-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "9995e2fd8644754fca9e57948fce03916c976d18bffc35b59c3f951f16ea4307e0574b6da150c6716c06ddd81c0fe928005d5bacaaeafa49ba57caf02b61005f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-script-fonts"

RDEPENDS:${PN} += ""

inherit rpm
