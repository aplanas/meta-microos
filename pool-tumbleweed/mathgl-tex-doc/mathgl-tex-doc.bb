SUMMARY = "Documentation for mglTeX"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides documentation for mglTeX."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-tex-doc-8.0.1-4.2.noarch.rpm"
RPM_HASH = "fb3b492913da2909c5dae1183dc067a49b9ffba7f15310b4bf9b19234ae89ccf1cb8377faadb0bf63ff046dbec581b8668c388109750b3e16e7c429a88609561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathgl-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm
