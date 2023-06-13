SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-ams-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "760c0a260adf2d2e4bf794358a3a3a18324077c54411c1361516494f98cf70ea67110090b0df360d25feafce251e72840da482ba8b9255814756b6efd2ebb0a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-ams-fonts"

RDEPENDS:${PN} += ""

inherit rpm
