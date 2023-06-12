SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-sansserif-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "7e6b6eddcf50b75e57599d53816e17b4cbc0e7d235c71e65b8ad2fd5c8f665220fe8d941ddb2bf574e8525db3989d121ab216377fc3f5035401edc04f67bade5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-sansserif-fonts"
RDEPENDS:${PN} += ""

inherit rpm
