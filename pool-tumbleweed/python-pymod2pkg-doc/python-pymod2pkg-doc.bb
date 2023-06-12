SUMMARY = "Documentation for python module name to package name map library"
DESCRIPTION = "Documentation for python module name to package name map library."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "python-pymod2pkg-doc-0.26.0-1.10.noarch.rpm"
RPM_HASH = "dd051de581f3e299c0ab1bc1561c7a4991c22ce43a3c0223fbff5e147bbc2ea69798b17f0fcc54c7024d7461bb927e12da50775b8a55d87f685a4acc3d73054c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pymod2pkg-doc"
RDEPENDS:${PN} += ""

inherit rpm
