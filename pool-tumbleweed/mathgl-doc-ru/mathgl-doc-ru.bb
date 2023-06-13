SUMMARY = "Russian documentation for MathGL"
DESCRIPTION = "MathGL is a library for making scientific graphics. It provides data \
plotting and handling of large data arrays, as well as window and \
console modes and for embedding into other programs. \
 \
This package provides Russian documentation for MathGL."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "mathgl-doc-ru-8.0.1-3.3.noarch.rpm"
RPM_HASH = "188092649c840c374dc2774b6a1f2a10e5a728914dc3bda231fed349199496eec3d3e76f9ea0be8aebbf15e4093c125e8db0e883761274726da29c552f935e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mathgl-doc:ru) \
mathgl-doc-ru"

RDEPENDS:${PN} += "mathgl-doc"

inherit rpm
