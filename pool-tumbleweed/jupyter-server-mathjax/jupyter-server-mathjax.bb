SUMMARY = "MathJax resources as a Jupyter Server Extension -- configuration"
DESCRIPTION = "MathJax resources as a Jupyter Server Extension. \
This package contains the jupyter server extension configuration common \
to all python flavors."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "0.2.6"

RPM_NAME = "jupyter-server-mathjax-0.2.6-1.7.noarch.rpm"
RPM_HASH = "84b81872464d80e34f00f9b0fb1cfdc01de247f3f77e0485b68c4b98fed3936d337d6a5272490d82e5bfd8fd470aac26a66d40d8140627f9de3ddb07f64c72e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-server-mathjax"

RDEPENDS:${PN} += ""

inherit rpm
