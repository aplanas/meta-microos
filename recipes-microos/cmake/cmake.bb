SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.3"

RPM_NAME = "cmake-3.26.3-3.1.aarch64.rpm"
RPM_HASH = "3242cf0a6943e756eea78cc0e07c5f677a79bb46ba15407f10cd5f075b98eab7e98d760213c1b842e463020d3ef7a487aade98cf628b56a534c9bfab13f74fca"

RPROVIDES:${PN} += "cmake cmake(aarch-64)"
RDEPENDS:${PN} += "cmake-implementation"

inherit rpm
