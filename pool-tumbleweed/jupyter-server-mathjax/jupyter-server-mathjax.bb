SUMMARY = "MathJax resources as a Jupyter Server Extension -- configuration"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension. \
This package contains the jupyter server extension configuration common \
to all python flavors."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "jupyter-server-mathjax-0.2.6-1.8.noarch.rpm"
RPM_HASH = "f7dfc092ec8ac39b5b043082c10485487430b440446510eae3e059e28ef816fbaba29abb11a7fb71527b2fd430f40873ee26e3e5c88e65ff360332dfba651675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-mathjax"

RDEPENDS:${PN} += ""

inherit rpm
