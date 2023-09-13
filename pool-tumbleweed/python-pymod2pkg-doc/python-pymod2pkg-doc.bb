SUMMARY = "Documentation for python module name to package name map library"
DESCRIPTION = "Documentation for python module name to package name map library."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python-pymod2pkg-doc-0.26.0-2.1.noarch.rpm"
RPM_HASH = "240c2899cc37a48892c28672963b876da78508de717a941cecaf9f569e2447ee2bbdf8e84f6f430bcba0ea3796c3256c6f9625bc96e7f0012c899ce6c16e43a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymod2pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
